
import java.util.*;

public class PassStudent { // Class name should start with an uppercase letter (convention)
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st subject marks:");
        float s1 = sc.nextFloat();

        System.out.println("Enter the 2nd subject marks:");
        float s2 = sc.nextFloat();

        System.out.println("Enter the 3rd subject marks:");
        float s3 = sc.nextFloat();

        float totalPercent = (s1 + s2 + s3) / 3;

        if (totalPercent >= 40 && s1 >= 33 && s2 >= 33 && s3 >= 33) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        sc.close(); // Closing Scanner to prevent resource leak
    }
}