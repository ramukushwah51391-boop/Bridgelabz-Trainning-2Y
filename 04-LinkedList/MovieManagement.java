
import java.util.Scanner;

public class MovieManagement {

    static class Node {
        String title;
        String director;
        int year;
        double rating;

        Node prev;
        Node next;

        Node(String title, String director, int year, double rating) {
            this.title = title;
            this.director = director;
            this.year = year;
            this.rating = rating;
            this.prev = null;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;
    static Scanner sc = new Scanner(System.in);

    // Add movie at beginning
    static void addBeginning() {
        System.out.print("Enter Movie Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Director: ");
        String director = sc.nextLine();

        System.out.print("Enter Release Year: ");
        int year = sc.nextInt();

        System.out.print("Enter Rating: ");
        double rating = sc.nextDouble();
        sc.nextLine();

        Node newNode = new Node(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        System.out.println("Movie added successfully!");
    }

    // Add movie at end
    static void addEnd() {
        System.out.print("Enter Movie Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Director: ");
        String director = sc.nextLine();

        System.out.print("Enter Release Year: ");
        int year = sc.nextInt();

        System.out.print("Enter Rating: ");
        double rating = sc.nextDouble();
        sc.nextLine();

        Node newNode = new Node(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        System.out.println("Movie added successfully!");
    }

    // Add movie at specific position (1-based)
    static void addPosition() {
        System.out.print("Enter Position: ");
        int pos = sc.nextInt();
        sc.nextLine();

        if (pos < 1) {
            System.out.println("Invalid Position");
            return;
        }

        System.out.print("Enter Movie Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Director: ");
        String director = sc.nextLine();

        System.out.print("Enter Release Year: ");
        int year = sc.nextInt();

        System.out.print("Enter Rating: ");
        double rating = sc.nextDouble();
        sc.nextLine();

        Node newNode = new Node(title, director, year, rating);

        if (pos == 1) {
            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
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
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            tail = newNode;
        }

        temp.next = newNode;

        System.out.println("Movie added successfully!");
    }

    // Remove movie by title
    static void removeMovie() {
        System.out.print("Enter Movie Title: ");
        String title = sc.nextLine();

        Node temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {

                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next;
                }

                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                } else {
                    tail = temp.prev;
                }

                System.out.println("Movie removed successfully!");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Movie not found");
    }

    // Search by director
    static void searchDirector() {
        System.out.print("Enter Director Name: ");
        String director = sc.nextLine();

        Node temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }

            temp = temp.next;
        }

        if (!found) {
            System.out.println("Movie not found");
        }
    }

    // Search by rating
    static void searchRating() {
        System.out.print("Enter Rating: ");
        double rating = sc.nextDouble();
        sc.nextLine();

        Node temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating == rating) {
                displayMovie(temp);
                found = true;
            }

            temp = temp.next;
        }

        if (!found) {
            System.out.println("Movie not found");
        }
    }

    // Display one movie
    static void displayMovie(Node temp) {
        System.out.println("----------------------");
        System.out.println("Title: " + temp.title);
        System.out.println("Director: " + temp.director);
        System.out.println("Year: " + temp.year);
        System.out.println("Rating: " + temp.rating);
    }

    // Display forward
    static void displayForward() {
        if (head == null) {
            System.out.println("No movies available");
            return;
        }

        Node temp = head;

        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    static void displayReverse() {
        if (tail == null) {
            System.out.println("No movies available");
            return;
        }

        Node temp = tail;

        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    // Update rating by title
    static void updateRating() {
        System.out.print("Enter Movie Title: ");
        String title = sc.nextLine();

        Node temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                System.out.print("Enter New Rating: ");
                temp.rating = sc.nextDouble();
                sc.nextLine();

                System.out.println("Rating updated successfully!");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Movie not found");
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== MOVIE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Remove Movie");
            System.out.println("5. Search by Director");
            System.out.println("6. Search by Rating");
            System.out.println("7. Display Forward");
            System.out.println("8. Display Reverse");
            System.out.println("9. Update Rating");
            System.out.println("10. Exit");

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
                    removeMovie();
                    break;

                case 5:
                    searchDirector();
                    break;

                case 6:
                    searchRating();
                    break;

                case 7:
                    displayForward();
                    break;

                case 8:
                    displayReverse();
                    break;

                case 9:
                    updateRating();
                    break;

                case 10:
                    System.out.println("Program Ended!");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
