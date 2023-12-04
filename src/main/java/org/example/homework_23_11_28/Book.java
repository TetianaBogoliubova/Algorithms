package org.example.homework_23_11_28;

//Для класса Book с полями String name, double price, boolean isPresent
//реализовать методы equals(Object o), hashCode(), compareTo(Book another)

public class Book {
    private final String name;
    private final double price;
    private final boolean isPresent;

    public Book(String name, double price, boolean isPresent) {
        this.name = name;
        this.price = price;
        this.isPresent = isPresent;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Book tempObject = (Book) object;
        if (tempObject.name == this.name) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + (int) price;
        result = 31 * result + (name == null ? 0 : name.hashCode());
        result = 31 * result + (isPresent ? 1 : 0);
        return result;
    }


    public int compareTo(Book another) {

        int compareToName = compareStrings(this.name, another.name);

        if (compareToName != 0) {
            return compareToName;
        }

        int compareToPrice = compareDouble(this.price, another.price);

        if (compareToPrice != 0) {
            return compareToPrice;
        }

        return compareBoolean(this.isPresent, another.isPresent);
    }

    private int compareStrings(String str1, String str2) {
        if (str1 == null && str2 == null) {
            return 0;
        } else if (str1 == null) {
            return -1;
        } else if (str2 == null) {
            return 1;
        } else {
            return str1.compareTo(str2);
        }
    }

    private int compareDouble(double x, double y) {
        if (x < y) {
            return -1;
        } else if (x == y) {
            return 0;
        } else {
            return 1;
        }
    }

    private int compareBoolean(boolean x, boolean y) {
        if (x == y) {
            return 0;
        } else if (x) {
            return 1;
        } else {
            return -1;
        }
    }
}











