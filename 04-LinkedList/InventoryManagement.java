
import java.util.Scanner;

public class InventoryManagement {

    static class Node {
        String itemName;
        int itemId;
        int quantity;
        double price;
        Node next;

        Node(String itemName, int itemId, int quantity, double price) {
            this.itemName = itemName;
            this.itemId = itemId;
            this.quantity = quantity;
            this.price = price;
            this.next = null;
        }
    }

    static Node head = null;
    static Scanner sc = new Scanner(System.in);

    // Create item
    static Node createItem() {
        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Item ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        return new Node(name, id, quantity, price);
    }

    // Add at beginning
    static void addBeginning() {
        Node newNode = createItem();

        newNode.next = head;
        head = newNode;

        System.out.println("Item added successfully!");
    }

    // Add at end
    static void addEnd() {
        Node newNode = createItem();

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        System.out.println("Item added successfully!");
    }

    // Add at specific position (1-based)
    static void addPosition() {
        System.out.print("Enter Position: ");
        int pos = sc.nextInt();
        sc.nextLine();

        if (pos < 1) {
            System.out.println("Invalid Position");
            return;
        }

        Node newNode = createItem();

        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("Item added successfully!");
    }

    // Remove item by ID
    static void removeItem() {
        System.out.print("Enter Item ID: ");
        int id = sc.nextInt();

        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }

        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed successfully!");
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item removed successfully!");
        }
    }

    // Update quantity
    static void updateQuantity() {
        System.out.print("Enter Item ID: ");
        int id = sc.nextInt();

        Node temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                System.out.print("Enter New Quantity: ");
                temp.quantity = sc.nextInt();

                System.out.println("Quantity updated successfully!");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Item not found");
    }

    // Search by ID
    static void searchById() {
        System.out.print("Enter Item ID: ");
        int id = sc.nextInt();

        Node temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }

            temp = temp.next;
        }

        System.out.println("Item not found");
    }

    // Search by name
    static void searchByName() {
        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        Node temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                found = true;
            }

            temp = temp.next;
        }

        if (!found) {
            System.out.println("Item not found");
        }
    }

    // Display one item
    static void displayItem(Node temp) {
        System.out.println("--------------------");
        System.out.println("Item Name: " + temp.itemName);
        System.out.println("Item ID: " + temp.itemId);
        System.out.println("Quantity: " + temp.quantity);
        System.out.println("Price: " + temp.price);
        System.out.println("Total: " + (temp.price * temp.quantity));
    }

    // Display all items
    static void display() {
        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    // Calculate total inventory value
    static void totalValue() {
        double total = 0;

        Node temp = head;

        while (temp != null) {
            total = total + (temp.price * temp.quantity);
            temp = temp.next;
        }

        System.out.println("Total Inventory Value: " + total);
    }

    // Sort by name
    static void sortByName(boolean ascending) {
        if (head == null || head.next == null) {
            display();
            return;
        }

        for (Node i = head; i.next != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {

                int result = i.itemName.compareToIgnoreCase(j.itemName);

                if ((ascending && result > 0) ||
                    (!ascending && result < 0)) {

                    String name = i.itemName;
                    i.itemName = j.itemName;
                    j.itemName = name;

                    int id = i.itemId;
                    i.itemId = j.itemId;
                    j.itemId = id;

                    int quantity = i.quantity;
                    i.quantity = j.quantity;
                    j.quantity = quantity;

                    double price = i.price;
                    i.price = j.price;
                    j.price = price;
                }
            }
        }

        display();
    }

    // Sort by price
    static void sortByPrice(boolean ascending) {
        if (head == null || head.next == null) {
            display();
            return;
        }

        for (Node i = head; i.next != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {

                if ((ascending && i.price > j.price) ||
                    (!ascending && i.price < j.price)) {

                    String name = i.itemName;
                    i.itemName = j.itemName;
                    j.itemName = name;

                    int id = i.itemId;
                    i.itemId = j.itemId;
                    j.itemId = id;

                    int quantity = i.quantity;
                    i.quantity = j.quantity;
                    j.quantity = quantity;

                    double price = i.price;
                    i.price = j.price;
                    j.price = price;
                }
            }
        }

        display();
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== INVENTORY MANAGEMENT =====");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Remove Item");
            System.out.println("5. Update Quantity");
            System.out.println("6. Search by ID");
            System.out.println("7. Search by Name");
            System.out.println("8. Display Inventory");
            System.out.println("9. Total Inventory Value");
            System.out.println("10. Sort by Name (Ascending)");
            System.out.println("11. Sort by Name (Descending)");
            System.out.println("12. Sort by Price (Ascending)");
            System.out.println("13. Sort by Price (Descending)");
            System.out.println("14. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addBeginning();
                    break;

                case 2:
                    addEnd();
                    break;

                case 3:
                    addPosition();
                    break;

                case 4:
                    removeItem();
                    break;

                case 5:
                    updateQuantity();
                    break;

                case 6:
                    searchById();
                    break;

                case 7:
                    searchByName();
                    break;

                case 8:
                    display();
                    break;

                case 9:
                    totalValue();
                    break;

                case 10:
                    sortByName(true);
                    break;

                case 11:
                    sortByName(false);
                    break;

                case 12:
                    sortByPrice(true);
                    break;

                case 13:
                    sortByPrice(false);
                    break;

                case 14:
                    System.out.println("Program Ended!");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
