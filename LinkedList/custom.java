class Node{
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LL{
    Node head;
    public void add(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } 
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
     }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class custom{
    public static void main(String[] args) {
        LL list = new LL();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display(); // Output: 10 20 30
    }
}