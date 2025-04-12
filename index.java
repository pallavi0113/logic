import java.util.ArrayList;

public class index {
    public static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    al.add(i + 1); // 1-based indexing
                    al.add(j + 1);
                    return al;
                }
                if (sum > target) break; // optimization
            }
        }

        al.add(-1);
        return al;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;

        ArrayList<Integer> result = subarraySum(arr, target);
        System.out.println(result); // Output: [2, 4]
    }
}
