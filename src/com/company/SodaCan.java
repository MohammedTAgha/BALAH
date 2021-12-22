package com.company;

import static java.lang.Math.PI;

public class SodaCan {
    public double height;
    public double diameter;
    SodaCan(double height  , double diameter){
        this.height=height;
        this.diameter=diameter;
    }
    public void getVolume(){
        System.out.println("VOLUME is "+2*PI*diameter*height);
    }
    public void getSurfaceArea(){
        System.out.println("SURFACE AREA is "+2*PI*diameter*(height+diameter));
    }
}
