
public class interSection {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node intersect(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;
        int size1=0;
        while (temp1!=null){
            size1++;
            temp1=temp1.next;
        }
        int size2=0;
        while (temp2!=null){
            size2++;
            temp2=temp2.next;
        }
        temp1=head1;
        temp2=head2;
        if(size1>size2){
            int diff=size1-size2;
            for(int i=1;i<=diff;i++){
                temp1=temp1.next;
            }
        }
        else{
            int diff=size2-size1;
            for(int i=1;i<=diff;i++){
                temp2=temp2.next;
            }
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
    public static void main(String[]arg){
        Node common =new Node(8);
        common.next=new Node(10);
        Node head1=new Node(3);
        head1.next=new Node(7);
        head1.next.next=common;
        Node head2=new Node(99);
        head2.next=new Node(1);
        head2.next.next=common;
        Node result=intersect(head1,head2);
        if(result!=null){
            System.out.println("The intersection point is: " + result.data);
        }
        else{
            System.out.println("No intersection point found.");
        }
    }
}

