
interface A {
    int age = 10; // Constants must be initialized
    String area = "Some Area"; // Constants must be initialized

    void show();
    void config();
}

class B implements A {
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }
}



public class Inter {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        // A.age = 10; // ❌ Not allowed (final variable)
        System.out.println(A.age); // ✅ Correct way to access
    }
}
