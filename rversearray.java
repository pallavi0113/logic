<<<<<<< HEAD
import java.util.*;
public class rversearray {
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the element:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("reverse Element of array:");
        for(int i=n-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }

}
=======
import java.util.*;
public class rversearray {
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the element:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("reverse Element of array:");
        for(int i=n-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }

}
>>>>>>> 1922271 (New add)
