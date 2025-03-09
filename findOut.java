
import java.util.*;
public class findOut {
    public static void main(String arg[]){
        String url;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the url:");
        url=sc.nextLine();
        if(url.endsWith(".com")){
            System.out.println("This a comercial website");
        }
        else if (url.endsWith(".org")){
            System.out.println("This a organization website");
        }
        else if(url.endsWith(".in")){
            System.out.println("This a indian website");
        }
        else{
            System.out.println("This other website");
        }
    }
}
