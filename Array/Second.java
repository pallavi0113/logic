public class Second {
    public static void main(String[] args) {
        int arr[]={12,35,1,10,34,1};
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        // int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first){
                second=arr[i];
            }
        }
        if(second==Integer.MIN_VALUE){
            System.out.println("-1");
        }
        else{
            System.out.println("Second: " + second);
        }

    }
}
