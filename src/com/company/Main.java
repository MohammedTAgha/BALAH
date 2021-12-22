package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        read data from user
        Scanner input = new Scanner(System.in);
        System.out.println("inter hight");
        int h = input.nextInt();
        System.out.println("inter width");
        int w = input.nextInt();
        // proccess
        int res =h * w ;
        //output
        System.out.println(res);
    }
}
