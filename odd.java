
import java.util.*;
public class odd {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        System.out.println("Natural odd number is: ");
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
