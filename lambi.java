
@FunctionalInterface
interface A{
    // void show(int i);
    int add(int i,int j);
}
public class lambi {
    public static void main(String[] args) {
        // A obj=() -> System.out.println("in show");  //?lambda expression
        // A obj = i -> System.out.println("in show" + i);
        A obj = (i,j) -> i+j;
        int result=obj.add(5, 4);
        System.out.println(result);
    }
}
