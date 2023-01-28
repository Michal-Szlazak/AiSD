package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList();

        insert(3, nums);
        insert(4, nums);
        insert(5, nums);
        insert(50, nums);
        insert(0, nums);
        insert(12, nums);
        insert(55, nums);

        System.out.println("Tree created");

        for(int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        delete(55, nums);
        delete(12, nums);

        System.out.println("tree after deletion");

        for(int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

    }

    public static void heapSort(List<Integer> nums) {

        int n = nums.size();

        for(int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {

            int temp = nums.get(0);
            nums.set(0, nums.get(i));
            nums.set(i, temp);

            heapify(nums, i, 0);
        }

    }

    public static void heapify(List<Integer> nums, int n, int root) {

        int largest = root;
        int leftChild = root * 2 + 1;
        int rightChild = root * 2 + 2;

        if(leftChild < n && nums.get(leftChild) > nums.get(largest)) {
            largest = leftChild;
        }
        if(rightChild < n && nums.get(rightChild) > nums.get(largest)) {
            largest = rightChild;
        }

        if(largest != root) {
            int swap = nums.get(root);
            nums.set(root, nums.get(largest));
            nums.set(largest, swap);

            heapify(nums, n, largest);
        }

    }

    public static void insert(Integer number, List heap) {

        heap.add(number);

        for(int i = heap.size() / 2 - 1; i >= 0; i--) {
            heapify(heap, heap.size(), i);
        }

    }

    public static void delete(Integer number, List<Integer> heap) {

        if(!heap.contains(number)) {
            return;
        }

        int indexToRemove;

        for (indexToRemove = 0; indexToRemove < heap.size(); indexToRemove++)
        {
            if (number == heap.get(indexToRemove))
                break;
        }

        heap.set(indexToRemove, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        for(int i = heap.size() / 2 - 1; i >= 0; i--) {
            heapify(heap, heap.size(), i);
        }

    }

}