public class MoveZero {
    public static void main(String[] args) {
        int [] arr={0,1,0,3,12};
        int left=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[left];
                arr[left]=arr[i];
                arr[i]=temp;
                left++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        
    }

}
