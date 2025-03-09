<<<<<<< HEAD
import java.util.*;
public class rotatearray {
    public static void main(String arg[])
    {
        int n,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        n=sc.nextInt();
        System.out.println("Enter the how many times right rotate: ");
        k=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array element: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Element of array before rotate:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0,j=n-k-1;i<j;i++,j--){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        for(int i=n-k,j=n-1;i<j;i++,j--){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        for(int i=0,j=n-1;i<j;i++,j--){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        System.out.println("Element of the array after rotate:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
=======
import java.util.*;
public class rotatearray {
    public static void main(String arg[])
    {
        int n,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        n=sc.nextInt();
        System.out.println("Enter the how many times right rotate: ");
        k=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array element: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Element of array before rotate:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0,j=n-k-1;i<j;i++,j--){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        for(int i=n-k,j=n-1;i<j;i++,j--){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        for(int i=0,j=n-1;i<j;i++,j--){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        System.out.println("Element of the array after rotate:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
>>>>>>> 1922271 (New add)
