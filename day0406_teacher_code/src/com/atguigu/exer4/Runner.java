package com.atguigu.exer4;

public class Runner extends Thread{
    private long time;
    private long runtimePerMeter;
    private long restTimePerTenMeter;

    private int distance ;

    private static boolean flag = true;//flag大家要跑，flag为false，要停下来

    public Runner(String name, long runtimePerMeter, long restTimePerTenMeter) {
        super(name);
        this.runtimePerMeter = runtimePerMeter;
        this.restTimePerTenMeter = restTimePerTenMeter;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();

        while(distance <30 && flag ){
            try {
                Thread.sleep(runtimePerMeter);
            } catch (InterruptedException e) {
//                e.printStackTrace();
                System.out.println("有人达到终点，比赛提前结束");
                break;
            }
            distance++;
            System.out.println(getName() + "跑了" + distance + "米");

            if(distance ==10 || distance ==20){
                System.out.println(getName() + "开始休息，休息"+ restTimePerTenMeter/1000+"秒....");
                try {
                    Thread.sleep(restTimePerTenMeter);
                } catch (InterruptedException e) {
//                    e.printStackTrace();
                    System.out.println("有人达到终点，比赛提前结束");
                    break;
                }
            }
        }

        if(distance >= 30){
            System.out.println(getName()  +"达到终点..");
            flag = false;//让其他人停下来
            long end = System.currentTimeMillis();
            time = end-start;
        }else{
            System.out.println(getName() + "被迫结束比赛");
        }
    }

    public int getDistance() {
        return distance;
    }

    public long getTime() {
        return time;
    }
}
