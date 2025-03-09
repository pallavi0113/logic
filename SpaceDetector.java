
public class SpaceDetector {
    public static void main(String[] args) {
        String str = "This is  a test string."; // Example string with double and triple spaces

        if (str.contains("  ")) {
            System.out.println("Double space detected.");
        }
        if (str.contains("   ")) {
            System.out.println("Triple space detected.");
        }
    }
}
