

public class pattern2 {
    public static void main(String[] args) {
        pattern2(4);
    }
    static void pattern2(int n){
        for(int r=1;r<=n;r++){
            for(int c=1;c<=r;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
