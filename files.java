import java.io.*;
import java.util.Scanner;

public class files {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "user_input.txt";

        try {
            // Write to file
            FileWriter writer = new FileWriter(fileName);
            System.out.println("Enter text (press Enter on an empty line to stop):");

            while (true) {
                String input = scanner.nextLine();
                if (input.length() == 0) {
                    break;
                }
                writer.write(input + "\n");
            }
            writer.close();

            // Read from file and display content
            System.out.println("\nContent of the file:");
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}