import java.io.*;
public class buffer2 {
    public static void main(String[] args) {
        try {
            // Creating BufferedReader to read from a file
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));

            String line;
            System.out.println("Reading from file:\n");

            // Reading file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Closing the BufferedReader
            br.close();

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
