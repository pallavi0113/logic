
class cellphone {
    void getring(){
        System.out.println("Ringing.....");
    }
    void getvibrate(){
        System.out.println("Vibration.....");
    }
}

public class demo {
    public static void main(String arg[]){
        cellphone c=new cellphone();
        c.getring();
        c.getvibrate();
    }
}