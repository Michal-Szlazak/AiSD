package org.example;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 4, 3, 2, 6, 5, 4, 6, 79, 100};
        mergeSort(numbers, 0, numbers.length - 1);

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

    public static void mergeSort(int[] numbers, int left, int right) {

        if(left < right) {

            int middle = (right + left) / 2;

            mergeSort(numbers, left, middle);
            mergeSort(numbers, middle + 1, right);

            merge(numbers,left, middle, right);
        }

    }

    public static void merge(int[] numbers, int left, int middle, int right) {

        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftSubArray = new int[n1];
        int[] rightSubArray = new int[n2];

        for(int i = 0; i < n1; ++i) {
            leftSubArray[i] = numbers[left + i];
        }
        for(int i = 0; i < n2; ++i) {
            rightSubArray[i] = numbers[middle + i + 1];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while(i < n1 && j < n2) {

            if(leftSubArray[i] <= rightSubArray[j]) {
                numbers[k] = leftSubArray[i];
                i++;
            } else if(leftSubArray[i] > rightSubArray[j]) {
                numbers[k] = rightSubArray[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            numbers[k] = leftSubArray[i];
            i++;
            k++;
        }
        while(j < n2) {
            numbers[k] = rightSubArray[j];
            j++;
            k++;
        }

    }

}