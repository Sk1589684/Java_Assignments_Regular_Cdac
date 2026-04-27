package Assignment18;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> list = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n1.Add\n2.Delete\n3.Modify\n4.Display All\n5.Search by ID\n6.Qty > Given\n7.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1: // Add
                    System.out.print("Enter id, name, qty, price: ");
                    int id = sc.nextInt();
                    String name = sc.next();
                    int qty = sc.nextInt();
                    double price = sc.nextDouble();

                    list.add(new Product(id, name, qty, price));
                    System.out.println("Product Added");
                    break;

                case 2: // Delete
                    System.out.print("Enter product id to delete: ");
                    int delId = sc.nextInt();

                    boolean removed = list.removeIf(p -> p.id == delId);
                    System.out.println(removed ? "Deleted" : "Product not found");
                    break;

                case 3: // Modify
                    System.out.print("Enter product id to modify: ");
                    int modId = sc.nextInt();

                    boolean found = false;
                    for (Product p : list) {
                        if (p.id == modId) {
                            System.out.print("Enter new name, qty, price: ");
                            p.name = sc.next();
                            p.qty = sc.nextInt();
                            p.price = sc.nextDouble();
                            found = true;
                            System.out.println("Updated");
                            break;
                        }
                    }
                    if (!found) System.out.println("Product not found");
                    break;

                case 4: // Display All
                    if (list.isEmpty()) {
                        System.out.println("No products available");
                    } else {
                        for (Product p : list) {
                            p.display();
                        }
                    }
                    break;

                case 5: // Search by ID
                    System.out.print("Enter product id: ");
                    int searchId = sc.nextInt();

                    boolean exists = false;
                    for (Product p : list) {
                        if (p.id == searchId) {
                            p.display();
                            exists = true;
                            break;
                        }
                    }
                    if (!exists) System.out.println("Product not found");
                    break;

                case 6: // Qty > Given
                    System.out.print("Enter qty: ");
                    int q = sc.nextInt();

                    boolean any = false;
                    for (Product p : list) {
                        if (p.qty > q) {
                            p.display();
                            any = true;
                        }
                    }
                    if (!any) System.out.println("No products found");
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 7);

        sc.close();
    }
}