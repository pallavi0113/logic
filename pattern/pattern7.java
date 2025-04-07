
    
    

public class pattern7 {
    public static void main(String[] args) {
        pattern7(4);
    }
    static void pattern7(int n){
        for(int r=1;r<=2*n;r++){
            int total=r>n?2*n-r:r;
            for(int s=0;s<n-total;s++){
                System.out.print("  ");
            }
            for(int c=total;c>=1;c--){
                System.out.print(c + " ");
            }
            for(int c=2;c<=total;c++){
            System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}



