import java.util.Map;
import java.util.HashMap;
public class Mapping {
    public static void main(String[] args) {
        Map<String, Integer> student = new HashMap<>();
        student.put("Pallavi", 56);
        student.put("ram", 16);
        student.put("sita", 26);
        System.out.println(student.keySet());
        for(String key: student.keySet()){
            System.out.println(key+ ":" + student.get(key));
        }
    }
}
