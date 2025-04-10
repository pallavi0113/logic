public class Pattern1 {
    public static void main(String[] args) {
        pattern1(4);
    }
    static void pattern1(int n){
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
