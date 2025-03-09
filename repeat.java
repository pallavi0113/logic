<<<<<<< HEAD
 import java.util.*;
public class repeat {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number which u want to check present or not");
        int find=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++)
        {
              if(arr[i]==find){
                // System.out.println("present");
                found=true;
                break;
              }

        }
        if(found==true){
            System.out.println(find + " number is repeated");
        }
        else{
            System.out.println("number is not repeated");
        }
        sc.close();

    }
}
=======
 import java.util.*;
public class repeat {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number which u want to check present or not");
        int find=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++)
        {
              if(arr[i]==find){
                // System.out.println("present");
                found=true;
                break;
              }

        }
        if(found==true){
            System.out.println(find + " number is repeated");
        }
        else{
            System.out.println("number is not repeated");
        }
        sc.close();

    }
}
>>>>>>> 1922271 (New add)
