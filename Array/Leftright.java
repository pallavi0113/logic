public class Leftright {
    public static void reverse(int [] a,int s,int e){
        while(s<=e){
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
    }
    public static void rightrotate(int[]a,int n,int k){
        reverse(a,0,n-k-1);
        reverse(a,n-k,n-1);
        reverse(a,0,n-1);
    }
    public static void leftrotate(int [] a,int n, int k){
        reverse(a,0,k-1);
        reverse(a,k,n-1);
        reverse(a,0,n-1);
    }
    public static void main(String arg[]){
        int [] arr={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=2;
        rightrotate(arr,n,k);
        System.out.print("right rotation:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        // leftrotate(arr, n, k);
        // System.out.println("left rotation");
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i] + " ");
        // }

    }
}