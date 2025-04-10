public class binaery1 {
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 2, 2, 3, 4};
            int target = 2;
            binaery1 obj = new binaery1();
            int frequency = obj.countFreq(arr, target);
            System.out.println("Frequency of " + target + " is: " + frequency);
        }
    
        public int countFreq(int[] arr, int target) {
            int first = findIndex(arr, target, true);   // Find first occurrence
            int last = findIndex(arr, target, false);   // Find last occurrence
    
            if (first == -1) {
                return 0;  // Target not found
            }
            return last - first + 1;
        }
    
        private int findIndex(int[] arr, int target, boolean findFirst) {
            int start = 0, end = arr.length - 1;
            int index = -1;
    
            while (start <= end) {
                int mid = start + (end - start) / 2;
    
                if (arr[mid] == target) {
                    index = mid;
                    if (findFirst) {
                        end = mid - 1;   // keep searching left
                    } else {
                        start = mid + 1; // keep searching right
                    }
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
    
            return index;
        }
    }