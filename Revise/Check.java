class Check{
    static boolean issort(int [] arr,int n){
        // for(int i=1;i<n;i++){
        //     if(arr[i]<arr[i-1]){             OPTIMAL CODE    tc(o(n))
        //         return false;
        //     }
        // }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    return false;                  //brute force   tc(o(n^2))  sc(o(1))
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int n=arr.length;
        System.out.print(issort(arr,n));
    }
}