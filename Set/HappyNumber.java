
import java.util.HashSet;
import java.util.Set;

class HappyNumber{
    public static boolean isHappy(int n){
        Set<Integer> seen = new HashSet<>();
        while(n!=1){
            if(seen.contains(n)){
                return false;
            }
            seen.add(n);
            n=SumofSquare(n);
        }
        return true;
    }
    private static int SumofSquare(int n){
        int sum=0;
        while(n!=0){
            int d=n%10;
            sum=sum+d*d;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=4;
        if(isHappy(n)){
            System.out.println("this is a happy number ");
        }
        else{
            System.err.println("this is not happy number ");
        } 
    }
}

//happy number is the 19=1^2+9^2=82
