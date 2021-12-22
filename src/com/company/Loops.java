package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str =in.nextLine();
        int count = 0;
        for (int i = 0; i<str.length();i++ ){
            char c = str.charAt(i);
            if (c == ' '){
                count++;
            }
        }
        System.out.println("spaces :" + count);
//        int balance;
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter your money");
//        balance = in.nextInt();

        // Fabonitshi series
//        int n1 =0;int n2 = 1;int sum = 0;int i = 0;
//        int target = 25252;
//        while (true){
//            int randomNum = ThreadLocalRandom.current().nextInt(0, 1000000 + 1);
//            i++;
//            if (randomNum==target){
//                System.out.println("i found "+target + " AT ATTEMPT "+i);
//                break;
//            }else{
//                System.out.println(" not found ATTEMPT "+i);
//            }
//        }
    }
}
