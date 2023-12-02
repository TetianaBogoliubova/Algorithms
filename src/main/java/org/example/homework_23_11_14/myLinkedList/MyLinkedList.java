package org.example.homework_23_11_14.myLinkedList;

//ДЗ от 07.11.23:
//Реализовать методы:
//public boolean removeLast() {
//public int get(int index) {
//public boolean contains(int data)
public class MyLinkedList {
    private Node head;

    public void pushToHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        System.out.println(head.getData());
    }

    public int get(int index) {
        Node tmp = head;
        int currentIndex = 0;
        if (index < 0) {
            return -1;
        }
        while (tmp != null && currentIndex < index) {
            tmp = tmp.getNext();
            currentIndex++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return tmp.getData();
        }
    }

    public boolean removeLast() {
        Node temp = head;
        Node beforElement = null;

        if (head == null || head.getNext() == null) {
            return false;
        }
        while (temp.getNext() != null) {
            beforElement = temp;
            temp = temp.getNext();
        }
        beforElement.setNext(null);
        if (beforElement == null) {
            head = null;
        }
        return true;
    }

    public boolean contains(int data) {
        Node tmp = head;
        while (tmp != null) {
            if (tmp.getData() == data) {
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }
}
