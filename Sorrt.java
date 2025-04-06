import java.util.*;

class Student {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return name + " (" + roll + ")";
    }
}

public class Sorrt {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ram", 105));
        students.add(new Student("Pallavi", 102));
        students.add(new Student("Sita", 108));

        // Sort by roll (descending)
        // students.sort((a, b) -> b.roll - a.roll);

        // Sort by name (ascending)
        students.sort((a, b) -> a.name.compareTo(b.name));

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
