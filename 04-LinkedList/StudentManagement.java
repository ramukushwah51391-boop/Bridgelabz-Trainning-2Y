
import java.util.Scanner;

public class StudentManagement {

    static class Node {
        int rollNo;
        String name;
        int age;
        char grade;
        Node next;

        Node(int rollNo, String name, int age, char grade) {
            this.rollNo = rollNo;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
    }

    static Node head = null;
    static Scanner sc = new Scanner(System.in);

    static void addBeginning() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Grade: ");
        char grade = sc.next().charAt(0);

        Node newNode = new Node(roll, name, age, grade);

        newNode.next = head;
        head = newNode;
    }

    static void addEnd() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Grade: ");
        char grade = sc.next().charAt(0);

        Node newNode = new Node(roll, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    static void addPosition() {
        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        if (pos < 1) {
            System.out.println("Invalid Position");
            return;
        }

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Grade: ");
        char grade = sc.next().charAt(0);

        Node newNode = new Node(roll, name, age, grade);

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
    }

    static void deleteStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.rollNo == roll) {
            head = head.next;
            System.out.println("Deleted successfully");
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.rollNo != roll) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Deleted successfully");
        }
    }

    static void searchStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        Node temp = head;

        while (temp != null) {
            if (temp.rollNo == roll) {
                System.out.println("Roll No: " + temp.rollNo);
                System.out.println("Name: " + temp.name);
                System.out.println("Age: " + temp.age);
                System.out.println("Grade: " + temp.grade);
                return;
            }

            temp = temp.next;
        }

        System.out.println("Student not found");
    }

    static void display() {
        Node temp = head;

        if (temp == null) {
            System.out.println("List is empty");
            return;
        }

        while (temp != null) {
            System.out.println("Roll No: " + temp.rollNo);
            System.out.println("Name: " + temp.name);
            System.out.println("Age: " + temp.age);
            System.out.println("Grade: " + temp.grade);
            System.out.println("------------------");

            temp = temp.next;
        }
    }

    static void updateGrade() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        Node temp = head;

        while (temp != null) {
            if (temp.rollNo == roll) {
                System.out.print("Enter New Grade: ");
                temp.grade = sc.next().charAt(0);
                System.out.println("Grade updated");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Student not found");
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1. Add Beginning");
            System.out.println("2. Add End");
            System.out.println("3. Add Position");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Student");
            System.out.println("6. Display Students");
            System.out.println("7. Update Grade");
            System.out.println("8. Exit");

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
                    deleteStudent();
                    break;

                case 5:
                    searchStudent();
                    break;

                case 6:
                    display();
                    break;

                case 7:
                    updateGrade();
                    break;

                case 8:
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
