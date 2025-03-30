abstract class a{
    public abstract void show();
}


public class anoyabst {
    public static void main(String a[]){
        a obj=new a(){
            public void show(){
                System.out.println("In a new show");
            }
        };
        obj.show();
    }
}
//? we create abstract and anoymous inner class both