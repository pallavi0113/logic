
import java.util.*;
public class invertedpyramid {
    public static void main(String arg[])
    {
        int n;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number of rows for print pyramid:");
        n=sc.nextInt();
        sc.close();
        for(int i=n;i>=1;i--)   //for rows
        {
            for(int j=1;j<=n-i;j++)  //for space print every row 
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)  //for star print inverted pyramid
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}