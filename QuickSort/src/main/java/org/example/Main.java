package org.example;

public class Main {
    public static void main(String[] args) {

        int[] nums = {10, 7, 8, 9, 1, 5};
        quickSort(nums, nums.length - 1, 0);

        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void quickSort(int[] nums, int right, int left) {

        if(left < right) {

            int mid = partition(nums, right, left);
            quickSort(nums, right, mid + 1);
            quickSort(nums, mid - 1, left);
        }
    }

    private static int partition(int[] nums, int right, int left) {

        int pivot = nums[right];
        int j = left;

        for(int i = left; i < right; i++) {

            if(nums[i] <= pivot) {

                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }

        }

        int temp = nums[j];
        nums[j] = pivot;
        nums[right] = temp;

        return j;
    }

}