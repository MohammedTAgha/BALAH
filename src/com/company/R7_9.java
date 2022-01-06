package com.company;
public class R7_9 {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] price = {40, 65, 32, 19};
        //Printing all elements of an array in a single row, separated by spaces
        for (int i =0; i < cars.length;i++){
            if (i==0) {
                System.out.print(cars[i]);
            }else{
                System.out.print(" "+cars[i]);
            }}
        // Computing the maximum of all elements in an array.
        int max = 0;
        for (int i = 0; i < price.length; i++) {
            if(price[i] > max)
                max = price[i];
        }
        System.out.println("\nmaximum of all elements");
        System.out.println(max);
        //Counting how many elements in an array are negative.
        int[] values = {-40, 65, -32, -19};
        int negitiveCount =0;
        for (int i = 0; i < values.length; i++) {
            if(values[i] < 0)
                negitiveCount++;
        }
        System.out.println("negative elements");
        System.out.println(negitiveCount);
    }
}
