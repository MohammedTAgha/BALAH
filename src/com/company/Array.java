package com.company;

import java.util.Scanner;

public class Array {


    public static void main(String[] args) {
        int[] smokers = new int[10];
        int smoking=0;
        int notsmoking=0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<smokers.length;i++ ){
            System.out.println("are you smoking yes :1 no : 0");
            smokers[i]=scanner.nextInt();
        }
        for(int j = 0; j<smokers.length;j++){
            if (smokers[j]==1){
                 smoking++;
            }else{
                notsmoking++;
            }
        }
        System.out.println("smoking " + (smoking/10)*100);
        System.out.println("not smoking " + (notsmoking/10)*100);

    }
}
