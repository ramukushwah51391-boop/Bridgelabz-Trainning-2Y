import java.util.*;

class searching {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        Node temp = head;
        int position = 1;
        boolean found = false;

        while (temp != null) {

            if (temp.data == target) {
                System.out.println("Element found at position " + position);
                found = true;
                break;
            }

            temp = temp.next;
            position++;
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}