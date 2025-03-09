<<<<<<< HEAD
import java.util.*;
public class sumeven {
    public static void main(String arg[]){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Sum of even number");
        int i=1,sum=0;
        while(i<=n){
            if(i%2==0){
                sum=sum+i;
            }
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
    
}
=======
import java.util.*;
public class sumeven {
    public static void main(String arg[]){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Sum of even number");
        int i=1,sum=0;
        while(i<=n){
            if(i%2==0){
                sum=sum+i;
            }
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
    
}
>>>>>>> 1922271 (New add)
