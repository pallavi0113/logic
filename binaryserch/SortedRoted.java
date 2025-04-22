public class SortedRoted {
        public static void main(String[] args) {
            // Test array and target value
            int[] nums = {4, 5, 6, 7, 0, 1, 2};
            int target = 0;
    
            // Creating object of Solution class
            Solution sol = new Solution();
    
            // Calling the search function
            int index = sol.search(nums, target);
    
            // Printing the result
            if (index != -1) {
                System.out.println("Target found at index: " + index);
            } else {
                System.out.println("Target not found.");
            }
        }
    }
    
    class Solution {
        public int search(int[] nums, int target) {
            int start = 0, end = nums.length - 1;
    
            while (start <= end) {
                int mid = start + (end - start) / 2;
    
                // If the middle element is the target
                if (nums[mid] == target) {
                    return mid;
                }
    
                // Check if the left half is sorted
                if (nums[start] <= nums[mid]) {
                    // Check if the target is in the left half
                    if (nums[start] <= target && target < nums[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
                // Else, the right half must be sorted
                else {
                    // Check if the target is in the right half
                    if (nums[mid] < target && target <= nums[end]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
    
            // Target not found
            return -1;
        }
    }
    

