package org.example.homework_10_10_23;

public class Main {
    public static void main(String[] args) {
        Task_2_FunctionForSum functionForSum = new Task_2_FunctionForSum();

        functionForSum.getFunctionByCycle(7, 2);
        System.out.println("Sum of numbers: " + functionForSum.getFunctionByRecursion(12, 3));
    }
}
