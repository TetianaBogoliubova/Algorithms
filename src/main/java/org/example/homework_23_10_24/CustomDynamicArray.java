package org.example.homework_23_10_24;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class CustomDynamicArray {
    private int[] data;
    private int size;
    private int count;

    public CustomDynamicArray() {
        data = new int[1];
        size = 1;
        count = 0;
    }

    public CustomDynamicArray(int capacity) {
        data = new int[capacity];
        size = capacity;
        count = 0;
    }

    // 1. O(1) - один элемент = одно действие
    public void add(int element) {
        if (count >= size) {
            growSize();
        }
        data[count++] = element;
    }

    // 2. О(n) - сдвигаем общее количество элементов n при добавлении элемента с указанным индексом
    public void addAt(int index, int element) {
        if (index >= count) throw new IndexOutOfBoundsException("Input index is out of bounds");
        if (count >= size) {
            growSize();
        }
        for (int i = count; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = element;
        count++;
    }

    // 3. O(1) - один элемент = одно действие
    public void remove() {
        if (count == 0) throw new NoSuchElementException();
        data[count - 1] = 0;
        count--;
    }

    // 4. О(n) - сдвигаем общее количество элементов n при удалении элемента с указанным индексом
    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index is out of bounds");
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    // 5. О(n) - уменьшение размера массива происходит через копирование оставшихся элементов n в новый массив
    public void shrinkSize() {
        if (count < size) {
            int[] newData = new int[count];
            System.arraycopy(data, 0, newData, 0, count);
            data = newData;
            size = count;
        }
    }

    // 6. O(1) - один элемент = одно действие (запись нового значения) по указанному индексу
    public void set(int index, int newData) {
        if (index < 0 || index >= count) {
            System.out.println("Index is out of bounds");
        }
        data[index] = newData;
    }

    // 7. O(1) - один элемент = одно действие (считывание значения) по указанному индексу
    public int get(int index) {
        if (index < 0 || index >= count) {
            System.out.println("Index is out of bounds");
        }
        return data[index];
    }

    // 8. O(1) - один элемент = одно действие
    public void clear() {
        count = 0;
    }

    // 9. О(n) - перебор всех значений через простой цикл
    public boolean contains(int d) {
        for (int i = 0; i < size; i++) {
            if (d == 0) {
                if (data[i] == 0) {
                    return true;
                }
            } else {
                if (d == data[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    // 10. O(1) - одно действие
    public boolean isEmpty() {
        if (size != 0) {
            return false;
        }
        return true;
    }

    // 11. O(1) - проверяет один элемент = одно действие
    public boolean hasNext() {
        return count < size;
    }

    // 12. O(1) - один элемент = одно действие
    public int next() {
        if (hasNext()) {
            return data[count++];
        } else {
            throw new NoSuchElementException();
        }
    }

    // О(n) - перебор всех значений через простой цикл
    private void growSize() {
        int[] newData = new int[2 * size];
        for (int i = 0; i < count; i++) {
            newData[i] = data[i];
        }
        data = newData;
        size = 2 * size;
    }

    @Override
    public String toString() {
        return "[" + Arrays.stream(data).limit(count).boxed()
                .map(Object::toString).reduce((s1, s2) -> s1 + ", " + s2)
                .orElse("") + "]";
    }

    public void printInnerStructure() {
        System.out.println("Inner Structure: " + Arrays.toString(data));
    }
}
