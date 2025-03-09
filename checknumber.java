
import java.util.*;
public class checknumber {
    public static void main(String arg[])
    {
        int n=5;
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
        sc.close();
        if(n>num){
           System.out.println( n+ " number is greater than " +num);
        }
        else {
            System.out.println( n+ " number is not greater than " +num);
        }

        
    }
}
