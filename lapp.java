enum Laptop{
    Macbook(2000),Xps(2200),Surface(1500);
    
    private int price;
    private Laptop(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }

}


public class lapp {
    public static void main(String[] args) {
        // Laptop lap=Laptop.Macbook;
        // System.out.println(lap + ":" + lap.getPrice());

        for (Laptop lap: Laptop.values()){
            System.out.println(lap+":"+lap.getPrice());
        }
    }
}
