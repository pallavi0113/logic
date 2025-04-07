
    

public class pattern3 {
    public static void main(String[] args) {
        pattern3(4);
    }
    static void pattern3(int n){
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n-r+1;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


