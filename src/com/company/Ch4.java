package com.company;

import java.util.Scanner;

public class Ch4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("inter first number:");
        int n1=input.nextInt();
        System.out.print("inter first number:");
        int n2=input.nextInt();
        System.out.printf("%10s %5d%n","sum:",n1+n2);
        System.out.printf("%10s %5d%n","Diference:",n1-n2);
        System.out.printf("%10s %5d%n","Product:",n1*n2);
        System.out.printf("%10s %5d%n","Distance:",Math.abs(n1-n2));
        System.out.printf("%10s %5d%n","Maximum:",Math.max(n1,n2));
        System.out.printf("%10s %5d%n","Minimum:",Math.min(n1,n2));

    }
}
