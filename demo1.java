 import java.util.*;
 class demo1 {
    int roll;
    String name;
    void getdata(){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the roll:");
        roll= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name:");
        name= sc.nextLine();
        sc.close();

    }
    void printdata(){
        System.out.println("Roll: "+ roll);
        System.out.println("name: " + name);
    }

    public static void main(String arg[]){
        demo1 d1=new demo1();
        demo1 d2=new demo1();
        d1.getdata();
        d2.getdata();
        d1.printdata();
        d2.printdata();
    }
}
