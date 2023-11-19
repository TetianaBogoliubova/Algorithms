package org.example.homework_23_10_17;

//Самый дешёвый путь
//    В каждой клетке прямоугольной таблицы N*M записано некоторое число.
//    Изначально игрок находится в левой верхней клетке.
//    За один ход ему разрешается перемещаться в соседнюю клетку либо вправо, либо вниз (влево и вверх перемещаться запрещено).
//    При проходе через клетку игрок платит определенную сумму, значение которой записано в этой клетке.
//    Требуется найти минимальную стоимость пути, отдав которую игрок может попасть в правый нижний угол.
//
//            Например, входные данные алгоритма:
//    int[][] pathCost = new int[][] {
//            {0,  11,  0,  0,  0, 0},
//            {10, 10, 10, 10, 10, 0},
//            {10, 10, 10,  4, 10, 0},
//    };
//    Результат: minimalCost = 11
//    int[][] pathCost = new int[][] {
//            {0,  11,  0,  0,  0, 100},
//            {10, 10, 10, 10, 10,   0},
//            {10, 10, 10,  4, 10,   0},
//    };
//    Результат: minimalCost = 21

public class Task2 {
    public static int findMinimalCost(int[][] allSteps) {
        int string = allSteps.length;
        int colunm = allSteps[0].length;

        int[][] dp = new int[string][colunm];
        dp[0][0] = allSteps[0][0];

        for (int i = 1; i < string; i++) {
            dp[i][0] = dp[i - 1][0] + allSteps[i][0];
        }

        for (int j = 1; j < colunm; j++) {
            dp[0][j] = dp[0][j - 1] + allSteps[0][j];
        }

        for (int i = 1; i < string; i++) {
            for (int j = 1; j < colunm; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + allSteps[i][j];
            }
        }

        return dp[string - 1][colunm - 1];
    }

    public static void main(String[] args) {
        int[][] allSteps1 = new int[][]{
                {0, 11, 0, 0, 0, 0},
                {10, 10, 10, 10, 10, 0},
                {10, 10, 10, 4, 10, 0}
        };

        int minimalCost1 = findMinimalCost(allSteps1);
        System.out.println("Minimal Cost 1: " + minimalCost1);

        int[][] allSteps2 = new int[][]{
                {0, 11, 0, 0, 0, 100},
                {10, 10, 10, 10, 10, 0},
                {10, 10, 10, 4, 10, 0}
        };

        int minimalCost2 = findMinimalCost(allSteps2);
        System.out.println("Minimal Cost 2: " + minimalCost2);
    }
}
