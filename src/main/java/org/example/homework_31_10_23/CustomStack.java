package org.example.homework_31_10_23;

public class CustomStack {
    // 1. Реализовать метод search() у написанного на занятии стека CustomStack (см. код в репозитории).
    // public int search(int element) -  определяет, существует ли объект в стеке.
    // Если элемент найден, возвращает позицию элемента с вершины стека. В противном случае он возвращает -1.
    private final Integer[] data;

    private int count;

    public CustomStack(int capacity) {
        data = new Integer[capacity];
        count = 0;
    }

    public void push(Integer element) {
        if (count == data.length) throw new RuntimeException("Stack is full");
        // if (count == data.length) growSize() -- dynamic stack implementation
        data[count++] = element;
    }

    public Integer pop() {
        if (count == 0) throw new RuntimeException("Stack is empty");
        Integer element = data[count - 1];
        data[count - 1] = null;
        count--;
        return element;
    }

    public Integer peek() {
        if (count == 0) throw new RuntimeException("Stack is empty");
        return data[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int search(int element) {
        for (int i = 0; i <= data.length; i++) {
            if (i == element) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        CustomStack stack = new CustomStack(4);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.search(6));
    }
}
