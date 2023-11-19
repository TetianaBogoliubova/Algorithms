package org.example.homework_23_10_24;

public class Main {

    public static void main(String[] args) {

        CustomDynamicArray array = new CustomDynamicArray();

        array.add(1);
        System.out.println("1 - add - " + array);
        array.printInnerStructure();

        array.add(2);
        System.out.println("1 - add - " + array);
        array.printInnerStructure();

        array.add(3);
        System.out.println("1 - add - " + array);
        array.printInnerStructure();

        array.add(4);
        System.out.println("1 - add - " + array);
        array.printInnerStructure();

        array.add(5);
        System.out.println("1 - add - " + array);
        array.printInnerStructure();

        array.addAt(0, 10);
        System.out.println("2 - addAt - " + array);
        array.printInnerStructure();

        array.remove();
        System.out.println("3 - remove - " + array);
        array.printInnerStructure();

        array.removeAt(0);
        System.out.println("4 - removeAt - " + array);
        array.printInnerStructure();

        array.shrinkSize();
        System.out.println("5 - shrinkSize - " + array);
        array.printInnerStructure();

        array.set(2, 6);
        System.out.println("6 - set - " + array);
        array.printInnerStructure();

        System.out.println("7 - get - " + array.get(1));
        array.printInnerStructure();

        array.clear();
        System.out.println("8 - clear - " + array);
        array.printInnerStructure();

        System.out.println("9 - contains - " + array.contains(5));
        array.printInnerStructure();

        System.out.println("10 - isEmpty - " + array.isEmpty());
        array.printInnerStructure();

        array.next();
        System.out.println("11 - hasNext - " + array.hasNext());

        System.out.println("12 - next - " + array.next());
        array.printInnerStructure();
    }
}
