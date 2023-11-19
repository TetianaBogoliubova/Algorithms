package org.example.homework_23_11_14.myLinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MyLinkedList myList = new MyLinkedList();
        myList.pushToHead(1);
        myList.pushToHead(2);
        myList.pushToHead(3);
        myList.pushToHead(4);

        System.out.println(myList.get(0));
        System.out.println(myList.removeLast());
        System.out.println(myList.contains(3));

    }
}
