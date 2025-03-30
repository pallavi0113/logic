class human{
    private int age=11;
    private String name="pallavi";
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
public class Dem {
    public static void main(String[] args) {
        human obj=new human();
        obj.setAge(11);;
        obj.setName("pallavi");
        System.out.println(obj.getName()+ ": " +obj.getAge());
    }
}
