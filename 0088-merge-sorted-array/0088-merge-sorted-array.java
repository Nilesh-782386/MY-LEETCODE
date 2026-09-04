class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m + n;
        while(n > 0 && m > 0) {
            if(nums1[m-1] < nums2[n-1]) {
                nums1[p-1] = nums2[n-1];
                p--; n--;
            } else {
                nums1[p-1] = nums1[m-1];
                p--; m--;
            }
        }
        while(m > 0) {
            nums1[p-1] = nums1[m-1];
                p--; m--;
        }
        while(n > 0) {
            nums1[p-1] = nums2[n-1];
                p--; n--;
        }
    }
}