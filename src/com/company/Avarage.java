package com.company;

import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        int count = 0 ;
        double input;
        double sum = 0.0;
        System.out.println("enter the numbers : press Q to exit  ");
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble()){
            input = in.nextDouble();
            sum= sum + input;
            count += 1;

        }
        if (count<=0){
            System.out.println("no data");
        }else{
            System.out.print("avg is : ");
            System.out.print(sum/count);
        }

    }
}
