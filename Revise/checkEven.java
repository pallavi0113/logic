class checkEven{
    public static void main(String[] args) {
        int arr[]={2,4,7,9,5};
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                cnt++;
            }
        }    
        System.out.println("count: " +cnt);
    }
}