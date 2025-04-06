import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));
        System.out.println("a" + 1);

        System.out.println("Pallavi" + new ArrayList<>());
        System.out.println("Pallavi" +  Integer.valueOf(56));
        String ans= Integer.valueOf(56)+ "" + new ArrayList<>();
        System.out.println(ans);
        System.out.println("a" + 'b');
    }
}
