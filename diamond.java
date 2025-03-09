<<<<<<< HEAD
import java.util.*;
public class diamond {
    public static void main(String arg[])
    {
        int n;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number of rows for print pyramid:");
        n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)   //for rows
        {
            for(int j=1;j<=n-i;j++)  //for space print every row 
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)  //for star print pyramid
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)  //for space print every row 
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)  //for star print pyramid
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
=======
import java.util.*;
public class diamond {
    public static void main(String arg[])
    {
        int n;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number of rows for print pyramid:");
        n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)   //for rows
        {
            for(int j=1;j<=n-i;j++)  //for space print every row 
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)  //for star print pyramid
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)  //for space print every row 
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)  //for star print pyramid
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
>>>>>>> 1922271 (New add)
