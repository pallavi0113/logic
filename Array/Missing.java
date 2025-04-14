public class Missing {
    public static void main(String[] args) {
        int arr[]=[1,2,4,6,3,7,8];
        int n=arr.length;
        int extra =n(n+1)/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("Missing number : " + return(extra-sum));
    }
}
