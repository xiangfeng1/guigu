package com.zxf.Exer;

public class book extends Date {
    private  int serial;//序号
    private int state;//状态
    private String name;
    private Date date;

    @Override
    public String toString() {
        if (date!=null)
        return serial + "\t\t\t" + state + "\t\t\t" + name + "\t\t\t" + date.toString();
        else {
            return serial + "\t\t\t" + state + "\t\t\t" + name;
        }
    }

    public book() {
    }

    public book(int serial, int state, String name) {
        this.serial = serial;
        this.state = state;
        this.name = name;
    }

    public book(int serial, int state, String name, Date date1) {
        this.serial = serial;
        this.state = state;
        this.name = name;
        this.date = date1;
    }


    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
