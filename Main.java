// --java project--
// --SALES MANAGMENTS--
import java.util.Scanner;

public class SimpleInventory {
    static String[] names = new String[100]; // Product names
    static int[] qty = new int[100];         // Product quantities
    static int[] sold = new int[100];        // Products sold
    static int count = 0;                    // Number of products

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            // Menu
            System.out.println("\n1.Add  2.View  3.Restock  4.Sell  5.Report  6.Search  7.Exit");
            System.out.print("Choice: ");
            choice = in.nextInt();
            in.nextLine(); // Clear buffer

            if (choice == 1) { // Add product
                System.out.print("Name: ");
                String name = in.nextLine();
                // Prevent duplicates
                if (find(name) != -1) {
                    System.out.println("Already exists!");
                } else  {
                    System.out.print("Quantity: ");
                    int q = in.nextInt();
                    names[count] = name;
                    qty[count] = q;
                    sold[count] = 0;
                    count++;
                }

            } else if (choice == 2) { // View all
                for (int i = 0; i < count; i++)
                    System.out.println(names[i] + " - " + qty[i]);

            } else if (choice == 3) { // Restock
                System.out.print("Name: ");
                String name = in.nextLine();
                int idx = find(name);
                if (idx != -1) {
                    System.out.print("Add qty: ");
                    qty[idx] += in.nextInt();
                } else System.out.println("Not found!");

            } else if (choice == 4) { // Sell
                System.out.print("Name: ");
                String name = in.nextLine();
                int idx = find(name);
                if (idx != -1) {
                    System.out.print("Sell qty: ");
                    int q = in.nextInt();
                    if (q <= qty[idx]) {
                        qty[idx] -= q;
                        sold[idx] += q;
                    } else System.out.println("Not enough stock!");
                } else System.out.println("Not found!");

            } else if (choice == 5) { // Sales report
                for (int i = 0; i < count; i++)
                    System.out.println(names[i] + " sold: " + sold[i]);

            } else if (choice == 6) { // Search
                System.out.print("Name: ");
                String name = in.nextLine();
                int idx = find(name);
                if (idx != -1)
                    System.out.println(names[idx] + " qty: " + qty[idx]);
                else System.out.println("Not found!");
            }

        } while (choice == 7);

        in.close();
    }

}