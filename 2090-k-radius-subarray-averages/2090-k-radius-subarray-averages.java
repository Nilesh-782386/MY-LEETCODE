class Solution {
    public int[] getAverages(int[] arr, int k) {

        if (2 * k >= arr.length) {
            int[] ans = new int[arr.length];
            Arrays.fill(ans, -1);
            return ans;
        }

        if (k == 0) {
            return arr;
        }

        int[] ans = new int[arr.length];

        long[] prefix = new long[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = arr[i] + prefix[i - 1];
        }

        ans[k] = (int)(prefix[2 * k] / (2 * k + 1));

        int t = 0;

        for (int i = k + 1; i < arr.length - k; i++) {

            long a = prefix[i + k] - prefix[t++];

            ans[i] = (int)(a / (2 * k + 1));
        }

        for (int i = 0; i < arr.length; i++) {

            if (i < k || i >= arr.length - k) {
                ans[i] = -1;
            }
        }

        return ans;
    }
}