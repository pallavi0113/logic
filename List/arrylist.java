import java.util.*;

public class arrylist {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add(1,"Graphes");
        System.out.println("ArrayList: " + list);
        list.remove("Banana");
        System.out.println("Removed" + list.get(2));
        for(String fruit: list){
            System.out.println("Fruit" + fruit);
        }
    }
}
