<<<<<<< HEAD
import java.util.*;
public class check {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        if(sc.hasNextInt()){
            int n=sc.nextInt();
            System.out.println(n+ " is an integer");

        }
        else if (sc.hasNextDouble()) {
            double n=sc.nextDouble();
            System.out.println(n+ " is a double");
        }
        else{
            System.out.println("This number is not an integer and double");
        }
        sc.close();
    }
}
=======
import java.util.*;
public class check {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        if(sc.hasNextInt()){
            int n=sc.nextInt();
            System.out.println(n+ " is an integer");

        }
        else if (sc.hasNextDouble()) {
            double n=sc.nextDouble();
            System.out.println(n+ " is a double");
        }
        else{
            System.out.println("This number is not an integer and double");
        }
        sc.close();
    }
}
>>>>>>> 1922271 (New add)
