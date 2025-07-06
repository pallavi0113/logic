import java.util.*;
class Node{
    int data;
    Node next;
    Node (int data1){
        this.data=data1;
        this.next=null;
    }
}
public class Length{
    private static int length(Node head){
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    public static void print(Node head){
        Node current=head;
        System.out.println("LinkedList :");
        while(current !=null){
            System.out.print(current.data + " -> ");
            current=current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element:");
        int n=sc.nextInt();
        if(n==0){
            System.out.print("Length is o");
            return;
        }
        System.out.print("Enter element1:");
        int data = sc.nextInt();
        Node head=new Node(data);
        Node current=head;
        for(int i=2;i<=n;i++){
            System.out.println("Enter element " + i + ":");
            data=sc.nextInt();
            current.next=new Node(data);
            current=current.next;
        }
        System.out.println("Length: " + length(head));
        print(head);
        sc.close();
    }
}