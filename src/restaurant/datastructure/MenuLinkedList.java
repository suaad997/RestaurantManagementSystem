package restaurant.datastructure;

import restaurant.model.FoodItem;

public class MenuLinkedList {
    private Node<FoodItem> head;

    public void addFood(FoodItem item) {
        Node<FoodItem> newNode = new Node<>(item);

        if (head == null) {
            head = newNode;
            return;
        }

        Node<FoodItem> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void displayMenu() {
        Node<FoodItem> temp = head;
        System.out.println("\n--- MENU ---");

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public FoodItem getFoodById(int id) {
        Node<FoodItem> temp = head;
        while (temp != null) {
            if (temp.data.getId() == id)
                return temp.data;
            temp = temp.next;
        }
        return null;
    }
}
