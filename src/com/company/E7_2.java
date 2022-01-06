package com.company;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class E7_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("random array");

        for (int i = 0; i < 10; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
            numbers.add(randomNum);

        }
        System.out.println(numbers);
        System.out.println(" Every element at an even index.");

        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                System.out.print(numbers.get(i) + " ");
            }
        }
        System.out.println("\nEvery even element.");
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                System.out.print(numbers.get(i) + " ");
            }
        }
        System.out.println("\nAll elements in reverse order");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
