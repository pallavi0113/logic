
import java.util.*;
class square{
    public static void main(String arg[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
           for ( int j=1;j<=n;j++)
           {
             System.out.print("*");
           }
           System.out.println();
        }
    }
  }