<<<<<<< HEAD
import java.util.*;
public class sortnumber {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("enter the element of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean sortarray=true;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                sortarray=false;
                break;
            }
        }
        if(sortarray){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
    
}
=======
import java.util.*;
public class sortnumber {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("enter the element of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean sortarray=true;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                sortarray=false;
                break;
            }
        }
        if(sortarray){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
    
}
>>>>>>> 1922271 (New add)
