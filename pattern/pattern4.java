
    

public class pattern4 {
    public static void main(String[] args) {
        pattern4(4);
    }
    static void pattern4(int n){
        for(int r=1;r<=n;r++){
            for(int c=1;c<=r;c++){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}


