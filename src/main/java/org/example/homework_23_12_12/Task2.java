package org.example.homework_23_12_12;

// Имея отсортированный массив arr[] и число x, напишите функцию, которая подсчитывает вхождения x в arr[]
// (сколько раз число x встречается в массиве).
// Ожидаемая временная сложность O(log n)
// arr[] = {1, 1, 2, 2, 2, 2, 3,}
// x = 2
// Вывод: 4 раза

public class Task2 {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 2, 2, 3,};

        System.out.println("Количество вхождений: " + count(array, 2));
    }

    public static int count(int[] array, int x) {

        int firstIndex = getFirstIndex(array, x);
        int lastIndex = getLastIndex(array, x);

        if (firstIndex != -1 && lastIndex != -1) {
            return lastIndex - firstIndex + 1;
        } else {
            return 0;
        }
    }

    private static int getFirstIndex(int[] array, int x) {
        int leftPart = 0;
        int rightPart = array.length - 1;
        int result = -1;

        while (leftPart <= rightPart) {
            int middle = leftPart + (rightPart - leftPart) / 2;

            if (array[middle] == x) {
                result = middle;
                rightPart = middle - 1;
            } else if (array[middle] < x) {
                leftPart = middle + 1;
            } else {
                rightPart = middle - 1;
            }
        }
        return result;
    }

    private static int getLastIndex(int[] array, int x) {
        int leftPart = 0;
        int rightPart = array.length - 1;
        int result = -1;

        while (leftPart <= rightPart) {
            int middle = leftPart + (rightPart - leftPart) / 2;

            if (array[middle] == x) {
                result = middle;
                leftPart = middle + 1;
            } else if (array[middle] < x) {
                leftPart = middle + 1;
            } else {
                rightPart = middle - 1;
            }
        }
        return result;
    }
}
