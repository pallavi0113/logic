
    

public class pattern5 {
    public static void main(String[] args) {
        pattern5(4);
    }
    static void pattern5(int n){
        for(int r=0;r<2*n;r++){
            int total=r>n?2*n-r:r;
            for(int c=0;c<total;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


