<<<<<<< HEAD
import java.util.*;
public class second {
    public static void main(String arg[]){
        int n;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the element of array:");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("element of array:");
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        System.out.println("element of sorted array:");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ar[i]>ar[j]){
                    int max=ar[i];
                    ar[i]=ar[j];
                    ar[j]=max;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        System.out.print("Second largest number in array:"+ ar[n-2]);
    }
}
=======
import java.util.*;
public class second {
    public static void main(String arg[]){
        int n;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the element of array:");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("element of array:");
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        System.out.println("element of sorted array:");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ar[i]>ar[j]){
                    int max=ar[i];
                    ar[i]=ar[j];
                    ar[j]=max;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        System.out.print("Second largest number in array:"+ ar[n-2]);
    }
}
>>>>>>> 1922271 (New add)
