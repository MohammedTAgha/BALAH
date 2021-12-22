package com.company;

import java.util.Dictionary;

public class Tester {
    public static void main(String[] args) {
        //through a dice 24 times
        int rounds =0;
        int double6 = 0;
        int roundDuble6 =0;
        while(rounds<100) {
            roundDuble6 =0;
            for (int i = 1; i <= 24; i++) { // through a dice 24 times
                System.out.println(">> t " + i + " r "+rounds); // print the round and attempt
                System.out.println((rounds*24)+i); // print attempt index
                if(Dice.through2Dice()){ // this through a pair of dice (return true if simelar)
                    System.out.println("🎲✔✔ WELL DONE");
                    double6++;
                    roundDuble6++;
                }
                System.out.println("==========");
            }
            System.out.println("this round you got double "+ roundDuble6 + "times");
            rounds++;
            System.out.println("rounds :" + rounds);
        }
        System.out.println("Double6 is" + double6);

    }
}
