package org.example.homework_17_10_23;

public class Task1 {
//     1 уровень сложности: 1. Вычислить n-й член последовательности, заданной формулами:
//    a(2n) = a(n) + a(n-1),
//    a(2n+1) = a(n) — a(n-1),
//    a(0) = a(1) = 1.
//    Т.е.:
//    a(2) = a(21) = a(1) + a(0) = 2
//    a(3) = a(21 + 1) = a(1) - a(0) = 0
//    a(4) = a(22) = a(2) + a(1) = 3
//    a(5) = a(22 + 1) = a(2) - a(1) = 1
//    a(6) = a(23) = a(3) + a(2) = 2
//    a(7) = a(23 + 1) = a(3) - a(2) = -2
//    последовательность: 1 1 2 0 3 1 2 -2

    public static int sequenceOfNumbers(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            int halfNum = n / 2;
            return sequenceOfNumbers(halfNum) + sequenceOfNumbers(halfNum - 1);
        } else {
            int halfNum = n / 2;
            return sequenceOfNumbers(halfNum) - sequenceOfNumbers(halfNum - 1);
        }
    }

    public static void main(String[] args) {
        int n = 7; // Замените значение n на необходимое
        int result = sequenceOfNumbers(n);
        System.out.println("n-й член последовательности: " + result);
    }

}
