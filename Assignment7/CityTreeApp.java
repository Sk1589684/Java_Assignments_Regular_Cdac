package Assignment7;

import java.util.*;


public class CityTreeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TreeMap to store city -> list of trees (sorted by city)
        TreeMap<String, List<String>> map = new TreeMap<>();

        int ch;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add City & Trees");
            System.out.println("2. Find Trees of City");
            System.out.println("3. Delete City");
            System.out.println("4. Display All");
            System.out.println("5. Add Tree to Existing City");
            System.out.println("6. Find Cities by Tree Name");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            ch = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (ch) {

                // 1. Add new city
                case 1:
                    System.out.print("Enter city name: ");
                    String city = sc.nextLine();

                    if (map.containsKey(city)) {
                        System.out.println("City already exists!");
                    } else {
                        System.out.print("Enter number of trees: ");
                        int n = sc.nextInt();
                        sc.nextLine();

                        List<String> trees = new ArrayList<>();

                        for (int i = 0; i < n; i++) {
                            System.out.print("Enter tree name: ");
                            trees.add(sc.nextLine());
                        }

                        map.put(city, trees);
                        System.out.println("City added successfully.");
                    }
                    break;

                // 2. Find trees of a city
                case 2:
                    System.out.print("Enter city name: ");
                    String searchCity = sc.nextLine();

                    if (map.containsKey(searchCity)) {
                        System.out.println("Trees in " + searchCity + ": " + map.get(searchCity));
                    } else {
                        System.out.println("City not found.");
                    }
                    break;

                // 3. Delete city
                case 3:
                    System.out.print("Enter city name to delete: ");
                    String delCity = sc.nextLine();

                    if (map.remove(delCity) != null) {
                        System.out.println("City deleted.");
                    } else {
                        System.out.println("City not found.");
                    }
                    break;

                // 4. Display all (Iterator + foreach)
                case 4:
                    System.out.println("\n--- Using Iterator ---");
                    Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();

                    while (it.hasNext()) {
                        Map.Entry<String, List<String>> entry = it.next();
                        System.out.println(entry.getKey() + " -> " + entry.getValue());
                    }

                    System.out.println("\n--- Using For-each ---");
                    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                        System.out.println(entry.getKey() + " -> " + entry.getValue());
                    }
                    break;

                // 5. Add new tree to existing city
                case 5:
                    System.out.print("Enter city name: ");
                    String cityName = sc.nextLine();

                    if (map.containsKey(cityName)) {
                        System.out.print("Enter tree name to add: ");
                        String newTree = sc.nextLine();

                        map.get(cityName).add(newTree);
                        System.out.println("Tree added successfully.");
                    } else {
                        System.out.println("City not found.");
                    }
                    break;

                // 6. Find cities where tree exists
                case 6:
                    System.out.print("Enter tree name: ");
                    String treeSearch = sc.nextLine();

                    boolean found = false;

                    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                        if (entry.getValue().contains(treeSearch)) {
                            System.out.println("Found in city: " + entry.getKey());
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Tree not found in any city.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (ch != 7);

        sc.close();
    }
}