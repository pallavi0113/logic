
import java.util.*;
public class hollowsquare {
    public static void main(String arg[])
    {
        int n;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the rows for print start:");
        n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n)
                {
                    System.out.print("*"+" ");   //print * 
                }
                else{
                    System.out.print(" "+" "); //print space
                }

            }
            System.out.println();
        }
    }
}