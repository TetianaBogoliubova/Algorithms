package org.example.homework_23_12_19;

//1. Написать метод проверки isSorted(), является ли данный массив отсортированным.

import java.util.Comparator;

public class Task1 {

    public static void main(String[] args) {

        int[] array1 = {1, 3, 3, 5, 8, 9};

        Integer[] array2 = {1, 3, 3, 5, 8, 9};

        String[] array3 = {"A", "B", "C", "C", "D"};

        Book book1 = new Book("Harry Potter1", 50.0, true);
        Book book2 = new Book("Harry Potter2", 50.0, true);
        Book book3 = new Book("Harry Potter3", 50.0, true);
        Book book4 = new Book("Harry Potter4", 10.0, true);
        Book book5 = new Book("Harry Potter5", 10.0, true);
        Book[] books = {book1, book2, book3, book4, book5};

        Comparator<Book> byName = Comparator.comparing(Book::getName);

        System.out.println(isSorted(array2, Comparator.naturalOrder()));
        System.out.println(isSorted1(array1));
        System.out.println(isSorted2(array3));
        System.out.println(isSorted3(books, byName));

    }

    public static <T> boolean isSorted(T[] array, Comparator<? super T> comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            if (comparator.compare(array[i], array[i + 1]) > 0)
                return false;
        }
        return true;
    }

    /// ***  или  *** ///
    public static boolean isSorted1(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted2(Comparable[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0)
                return false;
        }
        return true;
    }

    public static boolean isSorted3(Object[] array, Comparator comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            if (comparator.compare(array[i], (array[i + 1])) > 0)
                return false;
        }
        return true;
    }

}
