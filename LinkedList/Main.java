

public class Main {
    public static class Node{
        int data;
        Node next;
        Node head;
        Node(int data){
            this.data=data;
        }
    }
    public static void display(Node head){  //recurcive
        if(head==null) return;
        System.out.print(head.data + " ");
        display(head.next);
    }
    public static void displayr(Node head){  //recurcive
        if(head==null) return;
        displayr(head.next);
        System.out.print(head.data + " ");
    }
    public static int length(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public static void main(String[] args) {
        // LL list =new LL();
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(8);
        // list.insertFirst(17);
        // list.insertLast(99);
        // list.insert(100, 9);
        // list.display();

        Node a=new Node(5);
        Node b=new Node(4);
        Node c=new Node(6);
        Node d=new Node(2);
        System.out.println(a.next);
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println(length(a));

    }
}
