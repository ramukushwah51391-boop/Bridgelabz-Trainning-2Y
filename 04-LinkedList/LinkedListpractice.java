public class LinkedListpractice {
    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
        }
    }
    
    public static void display(Node head)
    {
        while (head!=null)
        {
            System.out.print(head.data+" -> ");
            head=head.next;
        }

    }

    public static void recursiveLinkedList(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" -> ");
        recursiveLinkedList(head.next);
    }




    public static void main(String[] args) {
        


    }



}