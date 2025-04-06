import java.io.*;

public class buffer3 {
    public static void main(String[] args) {
        String fileName = "output.txt"; // File name

        try {
            // Writing to file
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write("Hello, this is a test file!");
            bw.newLine();
            bw.write("BufferedWriter makes writing efficient.");
            bw.newLine();
            bw.close();
            System.out.println("Data written to file successfully.\n");

            // Checking if file exists
            File file = new File(fileName);
            if (file.exists()) {
                System.out.println("✅ File exists: " + fileName);
            } else {
                System.out.println("❌ File does NOT exist!");
                return; // Stop execution if file is missing
            }

            // Reading the file to verify content
            System.out.println("📖 Reading the written file content:");
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Error handling the file: " + e.getMessage());
        }
    }
}
