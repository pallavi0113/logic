class Leftrotate{
    // static void rotate(int arr[],int n){
    //     int temp[]=new int[n];
    //     for(int i=1;i<n;i++){
    //         temp[i-1]=arr[i];
    //     }
    //     temp[n-1]=arr[0];
    //     for(int i=0;i<n;i++){
    //         System.out.print(temp[i] + " ");
    //     }
    // }

    static void rotate(int arr[],int n){
        int temp=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String arg[]){
        int n=5;
        int arr[]={1,2,3,4,5};
        rotate(arr,n);
    }
}