class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int m = nums1.length;
        int n = nums2.length;

        int[] arr = new int[m + n];

        // Copy nums1
        for (int i = 0; i < m; i++) {
            arr[i] = nums1[i];
        }

        // Copy nums2
        for (int i = 0; i < n; i++) {
            arr[m + i] = nums2[i];
        }
        java.util.Arrays.sort(arr);
        int len = arr.length;
        if (len % 2 == 1) {
            return arr[len / 2];
        }
        return (arr[len / 2] + arr[len / 2 - 1]) / 2.0;
    }
}