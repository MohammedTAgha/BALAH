package com.company;

public class Year {
    public  int year;
    Year(int year) {
        this.year = year;
    }

     public void isLapYear(){
        if (year%4==0 && year%100!=0 || year%400==0  ){
            System.out.println(year + " is a lapp year");
        }else {
            System.out.println(year + " is not a lapp year");
        }
    }
}
