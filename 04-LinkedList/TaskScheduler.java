
import java.util.Scanner;

public class TaskScheduler {

    static class Node {
        int taskId;
        String taskName;
        int priority;
        String dueDate;
        Node next;

        Node(int taskId, String taskName, int priority, String dueDate) {
            this.taskId = taskId;
            this.taskName = taskName;
            this.priority = priority;
            this.dueDate = dueDate;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;
    static Node current = null;

    static Scanner sc = new Scanner(System.in);

    // Input task details
    static Node createTask() {
        System.out.print("Enter Task ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Task Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Priority: ");
        int priority = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Due Date: ");
        String date = sc.nextLine();

        return new Node(id, name, priority, date);
    }

    // Add at beginning
    static void addBeginning() {
        Node newNode = createTask();

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }

        if (current == null) {
            current = head;
        }

        System.out.println("Task added successfully!");
    }

    // Add at end
    static void addEnd() {
        Node newNode = createTask();

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }

        if (current == null) {
            current = head;
        }

        System.out.println("Task added successfully!");
    }

    // Add at specific position (1-based)
    static void addPosition() {
        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        if (pos < 1) {
            System.out.println("Invalid Position");
            return;
        }

        Node newNode = createTask();

        if (pos == 1) {
            addAtFirst(newNode);
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;

            if (temp == head) {
                System.out.println("Invalid Position");
                return;
            }
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (temp == tail) {
            tail = newNode;
        }

        tail.next = head;

        System.out.println("Task added successfully!");
    }

    static void addAtFirst(Node newNode) {
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }

        if (current == null) {
            current = head;
        }
    }

    // Remove task by ID
    static void removeTask() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.print("Enter Task ID: ");
        int id = sc.nextInt();

        Node temp = head;
        Node prev = tail;

        do {
            if (temp.taskId == id) {

                if (head == tail) {
                    head = tail = current = null;
                } else {
                    prev.next = temp.next;

                    if (temp == head) {
                        head = temp.next;
                    }

                    if (temp == tail) {
                        tail = prev;
                    }

                    if (temp == current) {
                        current = temp.next;
                    }

                    tail.next = head;
                }

                System.out.println("Task removed successfully!");
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);

        System.out.println("Task not found");
    }

    // View current task
    static void viewCurrent() {
        if (current == null) {
            System.out.println("No tasks available");
            return;
        }

        System.out.println("\nCurrent Task:");
        displayTask(current);
    }

    // Move to next task
    static void nextTask() {
        if (current == null) {
            System.out.println("No tasks available");
            return;
        }

        current = current.next;

        System.out.println("Moved to next task!");
        displayTask(current);
    }

    // Display one task
    static void displayTask(Node temp) {
        System.out.println("--------------------");
        System.out.println("Task ID: " + temp.taskId);
        System.out.println("Task Name: " + temp.taskName);
        System.out.println("Priority: " + temp.priority);
        System.out.println("Due Date: " + temp.dueDate);
    }

    // Display all tasks
    static void displayAll() {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        Node temp = head;

        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by priority
    static void searchPriority() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.print("Enter Priority: ");
        int priority = sc.nextInt();

        Node temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }

            temp = temp.next;

        } while (temp != head);

        if (!found) {
            System.out.println("Task not found");
        }
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== TASK SCHEDULER =====");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Remove Task");
            System.out.println("5. View Current Task");
            System.out.println("6. Move to Next Task");
            System.out.println("7. Display All Tasks");
            System.out.println("8. Search by Priority");
            System.out.println("9. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

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
                    removeTask();
                    break;

                case 5:
                    viewCurrent();
                    break;

                case 6:
                    nextTask();
                    break;

                case 7:
                    displayAll();
                    break;

                case 8:
                    searchPriority();
                    break;

                case 9:
                    System.out.println("Program Ended!");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
