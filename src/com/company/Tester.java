package com.company;

import java.util.Dictionary;

public class Tester {
    public static void main(String[] args) {

        int rounds =0;
        int wins = 0;
        while(rounds<24000/24) {
            for (int i = 1; i <= 24; i++) { // through a die 24 times
                System.out.println(">> t " + i + " r "+rounds); // print the round and attempt
                System.out.println((rounds*24)+i); // count all rolls
                if(Die.through2Dice()){ // this through a pair of dice (return true if simelar)
                    System.out.println("🎲✔✔ YOU WIN THIS TIME");
                    wins++;
                }
                System.out.println("==========");
            }
            rounds++;
            System.out.println("rounds :" + rounds);
        }
        System.out.println("wins is" + wins);

    }
}
