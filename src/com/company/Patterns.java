package com.company;

public class Patterns {
    public static void main(String[] args) {
        final int NMAX = 4;
        final int XMAX = 10;
        for(int i = 1; i <=XMAX;i++){
            for(int j = 1; j <=NMAX;j++){
                System.out.printf("%10.0f", Math.pow(i, j));
            }
            System.out.println();
        }
    }
}
