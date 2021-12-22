package com.company;

import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("first name");
        String first=input.nextLine();
        System.out.println("second name");
        String second=input.nextLine();
        System.out.printf(first.substring(0,3)+" & "+second.substring(0,3));
        System.out.printf("");

    }
}
