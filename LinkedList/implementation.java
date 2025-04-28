public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            } 
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        void insertFirst(int val){
            Node temp=new Node(val);
            if(head==null){
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
        void insetAt(int idx,int val){
            Node t=new Node(val);
            Node temp=head;
            if(idx==size()){
                insertAtEnd(val);
                return;
            }
            else if(idx==0){
                insertFirst(val);
                return;
            }
            else if(idx<0 || idx>size()){
                System.out.println("Wrong answer");
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(4);
        ll.display();  
        ll.insertAtEnd(5); 
        ll.display();
        ll.insertAtEnd(12);
        ll.display();
        ll.insertFirst(13);
        ll.display();
        ll.insetAt(5, 10);
        ll.display();
        System.out.println(ll.tail.data);
        System.out.println(ll.size());


    }
}
