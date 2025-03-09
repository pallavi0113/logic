
import java.util.*;
public class mutliplication {
    void table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }

    public static void main(String arg[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the table number:");
        int t=sc.nextInt();
        sc.close();
        System.out.println("Table of " +t);
        mutliplication obj=new mutliplication();
        obj.table(t);
    }
    
}
