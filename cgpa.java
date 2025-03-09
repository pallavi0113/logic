<<<<<<< HEAD
import java.util.*;
public class cgpa {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter marks for subject1:");
        double sub1=sc.nextDouble();
        System.out.print("enter marks for subject2:");
        double sub2=sc.nextDouble();
        System.out.print("enter marks for subject3:");
        double sub3=sc.nextDouble();
        double percentage=(sub1+sub2+sub3)/3;

        double Cgpa=percentage/9.5;
        System.out.printf("Your CGPA is: %.2f\n",Cgpa);
        sc.close();

    }
    
}
=======
import java.util.*;
public class cgpa {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter marks for subject1:");
        double sub1=sc.nextDouble();
        System.out.print("enter marks for subject2:");
        double sub2=sc.nextDouble();
        System.out.print("enter marks for subject3:");
        double sub3=sc.nextDouble();
        double percentage=(sub1+sub2+sub3)/3;

        double Cgpa=percentage/9.5;
        System.out.printf("Your CGPA is: %.2f\n",Cgpa);
        sc.close();

    }
    
}
>>>>>>> 1922271 (New add)
