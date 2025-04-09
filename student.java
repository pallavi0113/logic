
    import java.util.Scanner;
    public class student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMarks = 0;
        int numberOfSubjects = 5;

        // Input marks for 5 subjects
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        // Calculate percentage
        double percentage = (totalMarks / (double)(numberOfSubjects * 100)) * 100;

        // Display result
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
    }
}