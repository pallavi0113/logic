public class Missing {
    public static void main(String[] args) {
        int arr[]={1,2,4,6,3,7,8};
        int n1=arr.length;
        int n=8;
        int extra =n*(n+1)/2;
        int sum=0;
        for(int i=0;i<n1;i++){
            sum+=arr[i];
        }
        int missing=extra-sum;
        System.out.println("Missing: " + missing);
    }
}
