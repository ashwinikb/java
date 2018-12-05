package com.github.ashwinikb.code;

import java.util.Random;

public class GenerateRandomNumbers {

    public static void randomNumbers(int n) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            System.out.print(random.nextInt() + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(random.nextDouble() + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(random.nextBoolean() + " ");
        }


    }
}

