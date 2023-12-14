package org.example.homework_23_12_12;

import java.util.Arrays;

//Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент, который будет
// находиться на k-й позиции в конечном отсортированном массиве.
// Массив 1 - 100 112 256 349 770
// Массив 2 - 72 86 113 119 265 445 892
// к = 7
// Вывод : 256
// Окончательный отсортированный массив -
//  72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
//  7-й элемент этого массива равен 256.

public class Task1 {

    public static void main(String[] args) {

        int[] array1 = {100, 112, 256, 349, 770};
        int[] array2 = {72, 86, 113, 119, 265, 445, 892};

        getElement(array1, array2, 7);
    }

    public static void getElement(int[] array1, int[] array2, int k) {
        int[] generalArray = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;

        for (int n = 0; n < generalArray.length; n++) {

            if (i >= array1.length) {
                int temp = array2[j];
                generalArray[n] = temp;
                j++;

            } else if (j >= array2.length || array1[i] < array2[j]) {
                int temp = array1[i];
                generalArray[n] = temp;
                i++;

            } else {
                int temp = array2[j];
                generalArray[n] = temp;
                j++;
            }
            if (n == k) {
                System.out.println(k + "-й элемент этого массива равен = " + generalArray[k - 1]);
            }
        }
        System.out.println(Arrays.toString(generalArray));
    }
}
