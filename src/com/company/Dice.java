package com.company;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class Dice {
    public static Random generator;

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
    public static int throughDice () {
        int dice = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        generator = new Random();
        return 1 + generator.nextInt(6);
    }

}
