package org.example;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 10, 11, 15, 23545, 12341234};

        System.out.println(search(1, numbers));
        System.out.println(search(2, numbers));
        System.out.println(search(3, numbers));
        System.out.println(search(4, numbers));
        System.out.println(search(5, numbers));
        System.out.println(search(6, numbers));
        System.out.println(search(7, numbers));
        System.out.println(search(8, numbers));
        System.out.println(search(9, numbers));
        System.out.println(search(0, numbers));
        System.out.println(search(10, numbers));

    }

    public static boolean search(int number, int[] numbers) {

        int n = numbers.length;
        int left = 0;
        int right = n - 1;

        while(left <= right) {

            int mid = left + (right - left) / 2;

            if(numbers[mid] == number) {
                return true;
            } else if(numbers[mid] < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return false;
    }

}