
import java.util.Arrays;

class Second{
    static private void getele(int [] arr , int n){
        if(n==0 || n==1){
            System.out.print(1);
            System.out.print(" ");
            System.out.print(1);
            System.out.print("/n");
        }
        Arrays.sort(arr);
        int small=arr[1];
        int large=arr[n-2];
        System.out.println("Smallest number:" + small);
        System.out.println("Largest number" + large);
    }
    public static void main(String[] args) {
        int [] arr={10,28,45,14,87,3,4};
        int n=arr.length;
        getele(arr, n);
    }
}