package org.example.homework_23_12_19;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
//    Написать метод случайного перемешивания данных в массиве.
// Input:  1, 2, 2, 3, 4
// Output: 2, 1, 2, 4, 3

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4};
        System.out.println(Arrays.toString(shuffle(array)));
    }

    public static int[] shuffle(int[] array) {
        Random random = new Random();
        int index;
        int tmp;
        for (int i = 0; i < array.length; i++) {
            index = random.nextInt(i + 1);
            tmp = array[index];
            array[index] = array[i];
            array[i] = tmp;
        }
        return array;
    }
}
