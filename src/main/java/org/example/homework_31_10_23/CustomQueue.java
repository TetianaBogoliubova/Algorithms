package org.example.homework_31_10_23;

public class CustomQueue {
    // Реализовать методы enqueue(), dequeue(), size() у класса CustomQueue (заготовки методов см. в репозитории).
    private int[] data;
    private int head;
    private int tail;

    public CustomQueue(int capacity) {
        data = new int[capacity];
        head = -1;
        tail = -1;
    }

    public void enqueue1(int element) {
        data[++tail] = element;
        System.out.println("Add element: " + element);
    }

    public void enqueue2(int element) {
        int[] newData = new int[1 + data.length];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
        data[++tail] = element;
        System.out.println("Add element in full queue: " + element);
    }

    public void enqueue3(int element) {
        if (head == -1) {
            head = tail = 0;
            data[head] = element;
        } else if (tail == data.length - 1) {
            head = 0;
            data[tail] = element;
        } else if (head != 0) {
            head--;
            data[head] = element;
        } else {
            System.out.println("Queue is full. Cannot enqueue element.");
        }
        System.out.println("Add element: " + element);
    }

    public int dequeue() {
        if (head < tail) {
            return data[++head];
        } else {
            return -1;
        }
    }

    public boolean isEmpty() {
        return head == -1 || head > tail;
    }

    public int size() {
        if (head == -1 && tail == -1) {
            return 0;
        } else {
            return tail - head + 1;
        }
    }
    public static void main(String[] args) {

        CustomQueue queue = new CustomQueue(5);
        queue.enqueue1(1);
        queue.enqueue1(2);
        queue.enqueue1(3);
        queue.enqueue1(4);
        queue.enqueue1(5);
        queue.enqueue2(6);
        queue.enqueue3(7);
        System.out.println("The first element is: " + queue.dequeue());
        System.out.println("Queue is empty - " + queue.isEmpty());
        System.out.println("Size of queue: " + queue.size());
    }
}
