class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CreateNode
{
    public static void main(String[] args) {
    node a = new node(10);
    a.next=new node(20);
    a.next.next=new node(30);
    System.out.println(a.data);
    System.out.println(a.next.data);
    System.out.println(a.next.next.data);b 
    
    }
}