package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        n1 = input.nextInt();
        System.out.println("enter second number");
        n2 = input.nextInt();
        System.out.println("enter third number");
        n3 = input.nextInt();
        //double avg = (n1 +n2+n3)/3 ;
        System.out.println("avarage is :"+(n1 +n2+n3)/3);
        int bigest;
        // first methode
        if(n1>n2){
            if (n1>n3) {
                System.out.println("the bigest is "+n1);
            }else{
                System.out.println("the bigest is "+n3);
            }
        }else {
            if (n2>n3) {
                System.out.println("the bigest is "+n2);
            }else {
                System.out.println("the bigest is "+n3);
            }
        }
        //second whay
        if(n1 > n2 && n1 > n3) {
            System.out.println("the bigest is "+n1);
        }
        else if (n2 > n3) {
            System.out.println("the bigest is "+n2);
        }
        else {
            System.out.println("the bigest is "+n3);
         }

    }
}
