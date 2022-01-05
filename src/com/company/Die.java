package com.company;

import java.util.Random;

public class Die {
    public static Random generator;
    public static int throughDice () {
    generator = new Random();
    return 1 + generator.nextInt(6);
    }
    public static boolean through2Dice () {
        int d1 = throughDice();
        int d2 = throughDice();
        System.out.println(d1+ " || " + d2);
        if(d1 == 6 && d2==6){
            System.out.println("i found a semelar dice");
            return true;
        }else {
            return false;
        }
        
    }
}
