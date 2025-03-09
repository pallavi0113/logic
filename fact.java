
import java.util.*;
public class fact {
    public static void main(String arg[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number for factorial");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of number is " + fact);
        sc.close();
    }
    
}
