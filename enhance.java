class Student{
    int roll;
    String name;
    int marks;
}
public class enhance {
    public static void main(String arg[])
    {
        Student s1=new Student();
        s1.roll=1;
        s1.name="pallavi";
        s1.marks=99;

        Student s2=new Student();
        s2.roll=2;
        s2.name="pallavi";
        s2.marks=99;

        Student s3=new Student();
        s3.roll=3;
        s3.name="pallavi";
        s3.marks=99;

        Student Stu[]=new Student[3];
        Stu[0]=s1;
        Stu[1]=s2;
        Stu[2]=s3;

        for(Student stud: Stu){
            System.out.println(stud.name + ":" + stud.marks);
        }

    }
}
