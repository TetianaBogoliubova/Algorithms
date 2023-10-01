package org.example.homework_26_09_23;

// 1. Написать рекурсивную функцию вычисления факториала factorial(n) - произведения всех
// чисел до n включительно
public class RecursionFofFactorial {
    private int factorial;

    public int getFactorial() {
        return factorial;
    }

    public int getFactorial(int n) {
        factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public int getFactorialWithRecursion(int n) {
        if (n == 1) return 1;
        factorial = getFactorialWithRecursion(n - 1) * n;
        return factorial;
    }

}
