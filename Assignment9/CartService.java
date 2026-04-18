package Assignment9;


import java.util.*;

public class CartService {

    // Store available products
    public static List<Product> productList = new ArrayList<>();

    // Store user carts (username → products)
    public static Map<String, List<Product>> cartMap = new HashMap<>();

    // Static block → add 10 products
    static {
        productList.add(new Product(1, "Shoes", 3000, 10));
        productList.add(new Product(2, "Shirt", 1500, 20));
        productList.add(new Product(3, "Bag", 2000, 15));
        productList.add(new Product(4, "Watch", 5000, 8));
        productList.add(new Product(5, "Laptop", 50000, 5));
        productList.add(new Product(6, "Mobile", 20000, 10));
        productList.add(new Product(7, "Headphones", 2000, 12));
        productList.add(new Product(8, "Keyboard", 1000, 18));
        productList.add(new Product(9, "Mouse", 800, 25));
        productList.add(new Product(10, "Jacket", 2500, 10));
    }

    // Buy Products
    public static void buyProduct(Scanner sc) {

        System.out.print("Enter username: ");
        String username = sc.next();

        System.out.println("\nAvailable Products:");
        for (Product p : productList) {
            System.out.println(p.getId() + ". " + p.getName() + " Price:" + p.getPrice());
        }

        System.out.print("Enter product id: ");
        int pid = sc.nextInt();

        Product selected = null;
        for (Product p : productList) {
            if (p.getId() == pid) {
                selected = p;
                break;
            }
        }

        if (selected == null) {
            System.out.println("Invalid Product!");
            return;
        }

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        if (qty > selected.getQty()) {
            System.out.println("Not enough stock!");
            return;
        }

        double amount = qty * selected.getPrice();
        System.out.println("Amount = " + amount);

        // Add to cart
        Product cartItem = new Product(selected.getId(), selected.getName(),
                selected.getPrice(), qty);

        cartMap.putIfAbsent(username, new ArrayList<>());
        cartMap.get(username).add(cartItem);

        // reduce stock
        selected.setQty(selected.getQty() - qty);

        System.out.println("Added to cart!");
    }

    // Deliver Cart
    public static void deliverCart(Scanner sc) {

        if (cartMap.isEmpty()) {
            System.out.println("No carts available!");
            return;
        }

        System.out.println("Users:");
        for (String user : cartMap.keySet()) {
            System.out.println(user);
        }

        System.out.print("Enter username: ");
        String uname = sc.next();

        if (!cartMap.containsKey(uname)) {
            System.out.println("User not found!");
            return;
        }

        List<Product> cart = cartMap.get(uname);

        double total = 0;
        System.out.println("\n--- BILL ---");
        for (Product p : cart) {
            double amt = p.getPrice() * p.getQty();
            total += amt;
            System.out.println(p.getName() + " x " + p.getQty() + " = " + amt);
        }

        System.out.println("Total = " + total);

        System.out.print("Deliver? (y/n): ");
        char ch = sc.next().charAt(0);

        if (ch == 'y' || ch == 'Y') {
            System.out.println("Order Delivered!");
            cartMap.remove(uname);
        }
    }
}