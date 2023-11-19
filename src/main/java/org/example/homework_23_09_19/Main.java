package org.example.homework_23_09_19;

public class Main {
    public static void main(String[] args) {
        ArrayTask arrayTask = new ArrayTask();

        int[] array = {5, 5, 6, 7, 7, 8, 8, 9, 9};

        arrayTask.searchLinerInArray(array);
        System.out.println("Binary search: " + arrayTask.searchBinaryInArray(array));
    }
}