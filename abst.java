
abstract class car{
    public abstract void drive();
    public abstract void fly();
    public void playmusic(){
        System.out.println("play music");
    }
}
abstract class WagonR extends car
{
    public void drive(){
        System.out.println("Drivig..");
    }
}
class update extends WagonR{
    public void fly(){
        System.out.println("flying");
    }
}
public class abst {
    public static void main(String[] args) {
        car obj=new update();
        obj.drive();
        obj.playmusic();
        obj.fly();
    }
}
