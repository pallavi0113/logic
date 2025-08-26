public class Single {
    public static int getSingle(int[] arr) {
        int n = arr.length;

        // find min and max to handle negatives
        int mini = arr[0], maxi = arr[0];
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }

        int range = maxi - mini + 1;
        int[] hash = new int[range];

        // fill frequencies
        for (int i = 0; i < n; i++) {
            hash[arr[i] - mini]++;  // shift by 'mini'
        }

        // find the element with frequency 1
        for (int i = 0; i < n; i++) {
            if (hash[arr[i] - mini] == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String arg[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingle(arr);
        System.out.println("The single is : " + ans);
    }
}