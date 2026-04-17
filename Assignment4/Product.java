package Assignment4;

import java.util.*;

abstract class Product {
    int id;
    String name, type;
    double price;

    Product(int id, String name, String type, double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    abstract double calculateTax();
}

// Perishable
class Perishable extends Product {
    String mfgDate, expDate;

    Perishable(int id, String name, double price, String mfgDate, String expDate) {
        super(id, name, "Perishable", price);
        this.mfgDate = mfgDate;
        this.expDate = expDate;
    }

    double calculateTax() {
        return price * 0.05;
    }
}

// Non-Perishable
class NonPerishable extends Product {
    String category;

    NonPerishable(int id, String name, double price, String category) {
        super(id, name, "NonPerishable", price);
        this.category = category;
    }

    double calculateTax() {
        return price * 0.15 + 100;
    }
}

class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Perishable(1, "Milk", 50, "01-04", "05-04");
        Product p2 = new NonPerishable(2, "Chair", 2000, "Furniture");

        System.out.println("Tax Milk: " + p1.calculateTax());
        System.out.println("Tax Chair: " + p2.calculateTax());
    }
}
