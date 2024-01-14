package org.example.homework_24_01_09;

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        Integer[] data = {1, 3, 1, 5, 0, 7, 8};
        int k = 0;
        int result = findKthSmallest(data, k);
        System.out.println("k = " + k);
        System.out.println("Result: findKthSmallest(data, k) = " + result);
    }

    public static void shuffle(Integer[] data) {
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            swap(data, i, random.nextInt(i + 1));
        }
    }

    public static int findKthSmallest(Integer[] data, int k) {
        shuffle(data);
        return findKthSmallest(data, k, 0, data.length - 1);
    }

    private static int findKthSmallest(Integer[] data, int k, int start, int end) {
        if (start >= end) return data[start];
        int pivotIndex = partition(data, start, end);
        if (k == pivotIndex) {
            return data[pivotIndex];
        } else if (k < pivotIndex) {
            return findKthSmallest(data, k, start, pivotIndex - 1);
        } else {
            return findKthSmallest(data, k, pivotIndex + 1, end);
        }
    }

    private static int partition(Integer[] data, int start, int end) {
        int pivot = data[start];
        int i = start;
        int j = end + 1;
        while (true) {
            while (data[++i] < pivot) {
                if (i == end) break;
            }
            while (data[--j] > pivot) {
                if (j == start) break;
            }
            if (i >= j) break;
            swap(data, i, j);
        }
        swap(data, start, j);
        return j;
    }

    private static void swap(Object[] array, int i, int j) {
        if (i != j) {
            Object tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }
}


