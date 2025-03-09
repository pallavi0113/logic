
import java.util.*;
public class maxmin {
    public static void main(String  arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the element of array:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Element of an array:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
        int max=a[0];
        int min=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maximum= "+max);
        System.out.println("Minimum= "+min);

    }
}