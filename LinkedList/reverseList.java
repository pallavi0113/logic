public class reverseList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node reverse(Node head){
        if(head.next==null) return head;
        Node newHead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public static void display(Node head){
        if(head==null){
            System.out.println();
            return;
        }
        System.out.print(head.data+" ");
        display(head.next);
        // System.out.print(head.data+" ");
    }
    public static void main(String [] arg){
        Node a=new Node(3);
        Node b=new Node(5);
        Node c=new Node(1);
        Node d=new Node(2);
        Node e=new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        display(a);
        a=reverse(a);
        display(a);
        
    }
}
