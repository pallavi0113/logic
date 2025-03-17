import java.util.*;
public class secondlargest {
    public static void main(String arg[]){
        int arr[]={4,2,6,3,1,10,44};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("first largest "+arr[arr.length-1]);
        System.out.println("Second largest "+arr[arr.length-2]);
    }
}
