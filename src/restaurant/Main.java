package restaurant;

import restaurant.service.RestaurantService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RestaurantService service = new RestaurantService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Show Menu");
            System.out.println("2. Place Order");
            System.out.println("3. Process Order");
            System.out.println("4. Show Pending Orders");
            System.out.println("0. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> service.showMenu();
                case 2 -> {
                    System.out.print("Enter food ID: ");
                    service.placeOrder(sc.nextInt());
                }
                case 3 -> service.processOrder();
                case 4 -> service.showOrders();
                case 0 -> System.exit(0);
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
