//? recursive method we use binary search tc is o(logn) 


class binary {
    public static int binarys(int [] arr, int low,int high, int target){
        if(low>high) return -1;
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(target<arr[mid]){
            return binarys(arr,low,mid-1,target);
        }
        else{
           return binarys(arr,mid+1,high,target);
        }
    }
    public static int search(int[] arr, int low,int high,int target) {
        return binarys(arr,low,high,target);
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 6, 9, 10};
        int target = 10;
        int low=0,high=arr.length-1;

        int re = search(arr, low,high,target);

        if (re==-1) {
            System.out.println("target not found");  // ✅ This will now print
        } else {
            System.out.println("target found at index: " +re);
        }
    }
}
