public class Trarverse {
    public static void main(String[] args) {
        node a = new node(6);
        a.next = new node(10);
        a.next.next = new node(20);

        System.out.print(a.data);
        System.out.print(a.next.data);
        System.out.print(a.next.next.data);
    }
}