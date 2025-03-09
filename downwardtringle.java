
import java.util.*;
public class downwardtringle {
    public static void main(String arg[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row:");
        n=sc.nextInt();
        sc.close();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
