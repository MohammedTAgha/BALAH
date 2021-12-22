package com.company;

import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("enter your string");
        str=input.nextLine();
        if(str.indexOf("bug")!=-1){
            System.out.println("error");
        }else {
            System.out.println("no error");
        }
    }
}
