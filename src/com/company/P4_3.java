package com.company;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class P4_3 {
    public static void main(String[] args) {
        String str; String trim; String reverse;String result;int difference; String reverseDif;int sumDif;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your string:");
        str = input.nextLine();
        // last 3 chars
        trim=str.substring(str.length()-3,str.length());
        System.out.println("trim is" + trim);
        //reverse lasr 3 char
        reverse=""+ trim.charAt(2)
                +trim.charAt(1)
                +trim.charAt(0);
        System.out.println("rev is" +reverse);
        // the subtraction of the original from the reversed
        difference=Math.abs(parseInt(reverse) - parseInt(str));
        result=""+difference;
        System.out.println( "def is " + difference);
        // reverse the difference
        reverseDif=new StringBuilder(result).reverse().toString();
        System.out.println("reverseDif is" +reverseDif);
        // the summation of reversed and difference
        sumDif=parseInt(reverseDif) + difference;
        System.out.println("sum is" +sumDif);
    }
}
