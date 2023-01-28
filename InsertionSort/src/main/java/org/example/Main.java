package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {3, 2, 5, 6, 7, 1, 0, 100, -3243, 12341234};
        insort(numbers);

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

    public static void insort(int[] numbers) {

        int n = numbers.length;

        for(int i = 1; i < n; i++) {

            int key  = numbers[i];
            int numBefore = i - 1;

            while(numBefore >= 0 && numbers[numBefore] < key) {
                numbers[numBefore + 1] = numbers[numBefore];
                numBefore--;
            }

            numbers[numBefore + 1] = key;

        }

    }

}