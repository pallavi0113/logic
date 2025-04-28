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
        int size=0;
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            } 
            else{
                tail.next=temp;
            }
            tail=temp;
            size++;
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
            size++;
        }
        void insetAt(int idx,int val){
            Node t=new Node(val);
            Node temp=head;
            if(idx==size){
                insertAtEnd(val);
                return;
            }
            else if(idx==0){
                insertFirst(val);
                return;
            }
            else if(idx<0 || idx>size){
                System.out.println("Wrong answer");
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }
        int getAt(int idx){
            if(idx<0 || idx>size){
                System.out.println("Wrong answer");
                return -1;
            }
            Node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){
            if(idx==0){
                head=head.next;
                size--;
                return;
            }
            Node temp=head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
            size--;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
            System.out.println();
        }
        // int size(){    //?O(n)
        //     Node temp=head;
        //     int count=0;
        //     while(temp!=null){
        //         count++;
        //         temp=temp.next;
        //     }
        //     return count;
        // }
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
        ll.insetAt(4, 10);
        ll.display();
        ll.insetAt(0, 100);
        ll.display();
        ll.deleteAt(0);
        ll.display();
        // System.out.println(ll.getAt(-5));
        System.out.println(ll.head.data);
        // System.out.println(ll.size());
        System.out.println(ll.size);


    }
}
