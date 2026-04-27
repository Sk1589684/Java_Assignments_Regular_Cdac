package Assignment18;

import java.util.*;

class Product {
    int id, qty;
    String name;
    double price;

    Product(int id, String name, int qty, double price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    void display() {
        System.out.println(id + " | " + name + " | " + qty + " | " + price);
    }
}


