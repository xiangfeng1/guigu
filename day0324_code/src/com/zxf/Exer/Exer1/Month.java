package com.zxf.Exer.Exer1;

public enum Month {
    JANUARY("一月"),FEBRUARY("二月"),MARCH("三月"),APRIL("四月"),MAY("五月"),JUNE("六月"),JULY("七月"),AUGUST("八月"),SEPTEMBER("九月"),OCTOBER("十月"),NOVEMBER("十一月"),DECEMBER("十二月");
    private final String description;


    Month(String description) {
        this.description = description;
    }

    public static Month GetByValue(int value){
//        if (value >0&&value<13) {
//            return Month.values()[value-1];
//        }else{
//            return null;
//    }
        return (value>0&&value<13)?Month.values()[value-1]:null;
    }


    public int length(boolean leapYear){
        if (leapYear&&this==FEBRUARY) {
            return 29;
        } else if (!leapYear&&this==FEBRUARY) {
            return 28;
        } else if (this== APRIL||this== JUNE||this== SEPTEMBER||this== NOVEMBER) {
            return 30;
        }else {
            return 31;
        }
    }

    @Override
    public String toString() {
        return (ordinal()+1) +"->" + name() +"->" + description;
    }
}
