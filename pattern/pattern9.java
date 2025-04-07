

public class pattern9 {
    public static void main(String[] args) {
        pattern9(4);
    }
    static void pattern9(int n){
        int o=n;
        n=2*n;
        for(int r=0;r<=n;r++){
            for(int c=0;c<=n;c++){
                int atEvery=o-Math.min(Math.min(r,c),Math.min(n-r,n-c));
                System.out.print(atEvery + " ");
            }
            System.out.println();
        }
    }
}
