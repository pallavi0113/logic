
import java.util.*;
public class floydtriangle {
    public static void main(String arg[])
    {
        int n;
        int number=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

    }
}