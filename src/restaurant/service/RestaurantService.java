package restaurant.service;

import restaurant.datastructure.MenuLinkedList;
import restaurant.datastructure.OrderQueue;
import restaurant.model.FoodItem;
import restaurant.model.Order;

public class RestaurantService {
    private MenuLinkedList menu = new MenuLinkedList();
    private OrderQueue orders = new OrderQueue();
    private int orderCounter = 1;

    public RestaurantService() {
        menu.addFood(new FoodItem(1, "Burger", 5.99));
        menu.addFood(new FoodItem(2, "Pizza", 8.99));
        menu.addFood(new FoodItem(3, "Pasta", 7.49));
    }

    public void showMenu() {
        menu.displayMenu();
    }

    public void placeOrder(int foodId) {
        FoodItem food = menu.getFoodById(foodId);
        if (food == null) {
            System.out.println("Invalid food ID!");
            return;
        }

        Order order = new Order(orderCounter++, food);
        orders.enqueue(order);
        System.out.println("Order placed: " + order);
    }

    public void processOrder() {
        Order order = orders.dequeue();
        if (order == null) {
            System.out.println("No orders to process.");
        } else {
            System.out.println("Processing " + order);
        }
    }

    public void showOrders() {
        orders.displayOrders();
    }
}
