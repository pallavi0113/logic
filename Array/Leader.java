import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Leader {
    public static void main(String[] args) {
        int [] arr={16,17,4,3,5,2};
        List<Integer> leaders=new ArrayList<>();
        int maxRight= arr[arr.length-1];
        leaders.add(maxRight);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=maxRight){
                leaders.add(arr[i]);
                maxRight=arr[i];
            }
        }
        Collections.reverse(leaders);
        System.out.println("Leaders: " +leaders);
    }
}
