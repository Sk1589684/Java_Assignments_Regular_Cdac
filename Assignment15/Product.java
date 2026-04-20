package Assignment15;

import java.io.*;

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
}

class SharedBuffer {
    Product product;
    boolean available = false;

    synchronized void produce(Product p) {
        try {
            while (available)
                wait();

            product = p;
            available = true;
            notify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized Product consume() {
        try {
            while (!available)
                wait();

            available = false;
            notify();
            return product;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

class Producer extends Thread {
    SharedBuffer buffer;

    Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader("productdata.dat"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(":");

                Product p = new Product(
                        Integer.parseInt(data[0]),
                        data[1],
                        Integer.parseInt(data[2]),
                        Double.parseDouble(data[3])
                );

                buffer.produce(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    SharedBuffer buffer;

    Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("productamount.dat"))) {

            for (int i = 0; i < 2; i++) { // number of records
                Product p = buffer.consume();

                double amount = p.qty * p.price + (0.10 * p.price);

                bw.write(p.id + ":" + p.name + ":" + p.qty + ":" + p.price + ":" + amount);
                bw.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

