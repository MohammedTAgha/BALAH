package com.company;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        final int pizza = 20;
        int count;
        int finalPrice;
        Scanner input = new Scanner(System.in);
        System.out.println("welcome in ABDALAZZEZ PIZZA \n how many pizza you want");
        count = input.nextInt();
        finalPrice = pizza *count;

        System.out.println("do you need chees yes-no");
        Scanner input1 = new Scanner(System.in);
        String cheese =input1.nextLine();

        if (cheese.equals("yes")){
            System.out.println("cheese");
            finalPrice+=2;
        }

        System.out.println("do you need delevary yes-no");
        Scanner input2 = new Scanner(System.in);
        String delivery =input2.nextLine();
        if (delivery.equals("yes")){
            finalPrice+=4;
        }
        System.out.println("the final price is" + finalPrice);

    }
}
