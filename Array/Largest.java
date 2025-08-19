

public class Largest {
    public static int Find(int [] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
     public static void main(String[] args) {
        // int [] arr={9,2,4,1,8,6};
        // Arrays.sort(arr);
        // System.out.println("Larget element is : " +arr[arr.length-1]);

        int [] arr = {9,4,2,8,10,1};
        int largest=Find(arr);
        System.out.println("Largest element:" + largest);
    }
}