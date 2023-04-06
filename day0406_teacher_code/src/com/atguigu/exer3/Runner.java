package com.atguigu.exer3;

public class Runner extends Thread{
    private long time;
    private long runtimePerMeter;
    private long restTimePerTenMeter;

    public Runner(String name, long runtimePerMeter, long restTimePerTenMeter) {
        super(name);
        this.runtimePerMeter = runtimePerMeter;
        this.restTimePerTenMeter = restTimePerTenMeter;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();

        for(int i=1; i<=30; i++){
            try {
                Thread.sleep(runtimePerMeter);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + "跑了" + i + "米");

            if(i==10 || i==20){
                System.out.println(getName() + "开始休息，休息"+ restTimePerTenMeter/1000+"秒....");
                try {
                    Thread.sleep(restTimePerTenMeter);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        long end = System.currentTimeMillis();
        time = end-start;
        System.out.println(getName()  +"达到终点..");
    }

    public long getTime() {
        return time;
    }
}
