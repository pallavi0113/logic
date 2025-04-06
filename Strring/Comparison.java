
public class Comparison {
    public static void main(String[] args) {
        String a="Pallavi";
        String b="Pallavi";
        String c=a;
        System.out.println(c==a);
        System.out.println(a==b);

        String n1=new String ("Pallavi");
        String n2=new String("Pallavi");
        System.out.println(n1==n2);
        System.out.println(n1.equals(n2));


    }
}
