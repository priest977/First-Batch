package Collections.List;
public class LinkedList {
//    Node head;
//    Node tail;
   public static class Node{
        int data;
        Node next;

    public Node(int data) {
        this.data = data;
    }
}
public static void printLL(Node head){
        Node node = head;
        while (node != null){
            System.out.print(node.data + " -> ");
            node = node.next;
        }
    System.out.println("Null");
}

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = e;
        e.next = d;
        d.next = c;
        c.next = b;
        printLL(a);




    }


}
