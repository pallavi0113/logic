import java.util.*;
public class max {
    public static void main(String[] args) {
        int [] arr={1,3,23,9,18};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
            int maxvalue=arr[0];
             for(int i=0;i<arr.length;i++){
                 if(arr[i]>maxvalue){
                    maxvalue=arr[i];
                 }
             }
             return maxvalue;
    }
}
