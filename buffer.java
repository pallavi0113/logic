import java.io.*;

public class buffer {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("enter your name: ");
            String name=br.readLine();
            // Taking input as an integer
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(br.readLine()); 

            // Taking input as a double
            System.out.print("Enter your salary: ");
            double salary = Double.parseDouble(br.readLine());

            System.out.println("\nUser Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);

            br.close();
        }
        catch(IOException e){
            System.out.println("Error reading input: " + e.getMessage());
        }
        catch(NumberFormatException e){
            System.out.println("Invalid number format. Please enter valid numbers.");
        }
    }
    
}
