package org.example.homework_10_10_23;

public class Task_2_FunctionForSum {
//    Написать функцию sum(n, m), вычисляющую сумму тех чисел в диапазоне от 1 до n, которые делятся на m.
//            Например:
//    sum(7, 2) = 2 + 4 + 6 = 12
//    sum(12, 3) = 3 + 6 + 9 + 12 = 30
//    Решить задачу:
//    а) через цикл
//    б) через рекурсию

    public void getFunctionByCycle(int n, int m) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of numbers: " + sum);
    }

    public int getFunctionByRecursion(int n, int m) {
        if (n < m) {
            return 0;
        } else {
            int sum = getFunctionByRecursion(n - 1, m);
            if (n % m == 0) {
                sum = sum + n;
            }
            return sum;
        }
    }
}
