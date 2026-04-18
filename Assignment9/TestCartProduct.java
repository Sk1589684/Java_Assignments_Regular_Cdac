package Assignment9;


import java.util.*;


public class TestCartProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ch;
        do {
            System.out.println("\n1. Buy Products");
            System.out.println("2. Send Delivery");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    CartService.buyProduct(sc);
                    break;

                case 2:
                    CartService.deliverCart(sc);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (ch != 3);

        sc.close();
    }
}
