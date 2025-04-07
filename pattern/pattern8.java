
    
    

public class pattern8 {
    public static void main(String[] args) {
        pattern8(4);
    }
    static void pattern8(int n){
        for(int r=1;r<=n;r++){
            for(int s=0;s<n-r;s++){
                System.out.print("  ");
            }
            for(int c=r;c>=1;c--){
                System.out.print(c + " ");
            }
            for(int c=2;c<=r;c++){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
