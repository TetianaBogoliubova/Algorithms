package org.example.homework_23_12_19;

import java.util.Objects;

public class Book implements Comparable<Book>{

    private String name;
    private double price;
    private boolean isPresent;

    public Book(String name, double price, boolean isPresent) {
        this.name = name;
        this.price = price;
        this.isPresent = isPresent;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPresent() {
        return isPresent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !this.getClass().equals(o.getClass())) return false;
        Book another = (Book) o;
//        return this.price == another.price && this.isPresent == another.isPresent
//                && (this.name == null ? another.name == null : this.name.equals(another.name));
        return this.price == another.price && this.isPresent == another.isPresent
                && (Objects.equals(this.name, another.name));
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, price, isPresent);
    }

    @Override
    public int compareTo(Book another) {
        int result = (name != null ? name.compareTo(another.name) : (another.name == null ? 0 : -1));
//        if (result == 0) result = (price == another.price ? 0 : (price < another.price) ? 1 : -1);
        if (result == 0) result = Double.compare(another.price, price);
        if (result == 0) result = Boolean.compare(another.isPresent, isPresent);
        return result;
    }
}
