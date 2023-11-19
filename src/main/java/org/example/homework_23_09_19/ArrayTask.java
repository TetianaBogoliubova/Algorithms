package org.example.homework_23_09_19;

// 1 уровень сложности: Дан отсортированный массив, в котором все элементы встречаются дважды
// (один за другим), а один элемент появляется только один раз.
// Написать метод для нахождения этого элемента.
// Решить задачу:
// через простой цикл
// 2*. через бинарный поиск
public class ArrayTask {

    public void searchLinerInArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if ((i == 0 || arr[i] != arr[i - 1]) && (i == arr.length - 1 || arr[i] != arr[i + 1])) {
                System.out.println("Liner search: " + arr[i]);
            }
        }
    }

    public int searchBinaryInArray(int[] arr) {
        int firstIndex = 0;
        int endIndex = arr.length - 1;

        while (firstIndex < endIndex) {
            int middleIndex = firstIndex + (endIndex - firstIndex) / 2;

            if (middleIndex % 2 == 1) {
                if (arr[middleIndex] == arr[middleIndex - 1]) {
                    firstIndex = middleIndex + 1;
                } else {
                    endIndex = middleIndex - 1;
                }
            } else {
                if (arr[middleIndex] == arr[middleIndex + 1]) {
                    firstIndex = middleIndex + 2;
                } else {
                    endIndex = middleIndex - 1;
                }
            }
        }
        return arr[firstIndex];
    }
}

