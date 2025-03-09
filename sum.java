
import java.util.*;
public class sum {
    public static void main(String arg[])
    {
        int n1,n2,n3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        n1=sc.nextInt();
        System.out.println("Enter the 2nd number:");
        n2=sc.nextInt();
        System.out.println("Enter the 3rd number:");
        n3=sc.nextInt();
        sc.close();
        int sum=n1+n2+n3;
        System.out.println("Sum of the numbers:" +sum);

    }
    
}