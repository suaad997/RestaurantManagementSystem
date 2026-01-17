package restaurant.datastructure;

import restaurant.model.Order;

public class OrderQueue {
    private Node<Order> front;
    private Node<Order> rear;

    public void enqueue(Order order) {
        Node<Order> newNode = new Node<>(order);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public Order dequeue() {
        if (front == null) return null;

        Order order = front.data;
        front = front.next;

        if (front == null)
            rear = null;

        return order;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void displayOrders() {
        Node<Order> temp = front;
        System.out.println("\n--- Pending Orders ---");

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
