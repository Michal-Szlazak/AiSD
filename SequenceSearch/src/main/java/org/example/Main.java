package org.example;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(sequenceSearch(numbers, 1));
        System.out.println(sequenceSearch(numbers, 2));
        System.out.println(sequenceSearch(numbers, 7));
        System.out.println(sequenceSearch(numbers, 0));
        System.out.println(sequenceSearch(numbers, 10));
    }

    public static boolean sequenceSearch(int[] numbers, int number) {

        int n = numbers.length;

        for(int i = 0; i < n; i++) {
            if(numbers[i] == number) {
                return true;
            }
        }
        return false;
    }

}