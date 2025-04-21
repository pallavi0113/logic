public class Solution {
    static public int searchRange(int[] nums, int target) {
        int f = find(nums, target, true);
        int l = find(nums, target, false);
        
        if (f == -1 || l == -1)
            return 0;  // Target not found
        
        return l - f + 1;  // Count of occurrences
    }

    static private int find(int[] nums, int target, boolean findFirst) {
        int l = 0;
        int r = nums.length - 1;
        int pos = -1;
        
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                pos = mid;
                if (findFirst)
                    r = mid - 1;
                else
                    l = mid + 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 10, 10, 10, 18, 20};
        int res = searchRange(arr, 10);
        System.out.println(res);  // Output: 3
    }
}
