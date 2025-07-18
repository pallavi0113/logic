class UpperBond{
    public static int search(int [] arr, int target){
        int low=0,high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
        int mid=low+(high-low)/2;

        if(arr[mid]>target){
            ans= mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int arr[]={2,2,2,4,6,7,8,10,11};
        int x=2;
        int ans=search(arr,x);
        System.out.println("Lowerbond is :" + ans);
    }
}