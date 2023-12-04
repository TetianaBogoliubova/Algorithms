package org.example.homework_23_11_28;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Name", 10.0, true);

        System.out.println(book.equals(book));
        System.out.println(book.hashCode());
        System.out.println(book.compareTo(book));

    }

}
