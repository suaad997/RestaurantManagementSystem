package restaurant.model;

public class Order {
    private int orderId;
    private FoodItem food;

    public Order(int orderId, FoodItem food) {
        this.orderId = orderId;
        this.food = food;
    }

    public String toString() {
        return "Order #" + orderId + " -> " + food;
    }
}
