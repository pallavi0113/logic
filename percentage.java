<<<<<<< HEAD
import java.util.*;

public class percentage {
    public static void main(String[] args) {
        int total = 0;
        int sub = 5;  // Number of subjects
        Scanner sc = new Scanner(System.in);

        // Input marks for each subject
        for(int i = 1; i <= sub; i++){
            System.out.print("Enter the marks for Subject " + i + " (out of 100): ");
            total += sc.nextInt();
        }
        sc.close();

        // Calculate the percentage
        int maxMarks = sub * 100; // 5 subjects, each out of 100
        double percentage = (total / (double) maxMarks) * 100;

        // Display the results
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}
=======
import java.util.*;

public class percentage {
    public static void main(String[] args) {
        int total = 0;
        int sub = 5;  // Number of subjects
        Scanner sc = new Scanner(System.in);

        // Input marks for each subject
        for(int i = 1; i <= sub; i++){
            System.out.print("Enter the marks for Subject " + i + " (out of 100): ");
            total += sc.nextInt();
        }
        sc.close();

        // Calculate the percentage
        int maxMarks = sub * 100; // 5 subjects, each out of 100
        double percentage = (total / (double) maxMarks) * 100;

        // Display the results
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}
>>>>>>> 1922271 (New add)
