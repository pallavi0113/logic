
    

public class pattern6 {
    public static void main(String[] args) {
        pattern6(4);
    }
    static void pattern6(int n){
        for(int r=0;r<2*n;r++){
            int total=r>n?2*n-r:r;
            int no=n-total;
            for(int s=0;s<no;s++){
                System.out.print(" ");
            }
            for(int c=0;c<total;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

