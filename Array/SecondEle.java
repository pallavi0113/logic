import java.util.Arrays;

public class SecondEle {
    public static void getElement(int [] arr,int n){
        if(n==0 || n==1){
            System.out.println("-1");
        }
        // Arrays.sort(arr);
        // System.out.println("Second largest: " +arr[n-2]);
        // System.out.println("Second smallest: " +arr[1]);

        // Better approach 

    //     int small = Integer.MAX_VALUE;
    //     int S_small=Integer.MAX_VALUE;
    //     int large=Integer.MIN_VALUE;
    //     int S_large=Integer.MIN_VALUE;
    //     for(int i=0;i<n;i++){
    //         small=Math.min(small, arr[i]);
    //         large=Math.max(large, arr[i]);
    //     }
    //     for(int i=0;i<n;i++){
    //         if(S_large<arr[i] && large!=arr[i]){
    //             S_large=arr[i];
    //         }
    //         if(S_small>arr[i] && small!=arr[i]){
    //             S_small=arr[i];
    //         }
    //     }
    //     System.out.println("Second Largest: "+S_large);
    //     System.out.println("Second Smallestv: " +S_small);
    // }



    int largest=Integer.MIN_VALUE;
    for(int num: arr){
        if(num>largest) largest=num;
    }
    // int S_Larget=Integer.MIN_VALUE;
    // for(int num: arr){
    //     if(num>S_Larget && num<largest)  {
    //         S_Larget=num;
    //     }
    // }
    // System.out.println(S_Larget);
}

    
    public static void main(String arg[]){
        int [] arr={10,2,7,9,1,3,22};
        int n=arr.length;
        getElement(arr,n);
    }
}
