class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
          for (int i = 0; i < n; i++) {
            int x = nums1.length - n + i;
            int j = 0;
            while (j < m + i && nums1[j] <= nums2[i]) {
                j++;
            }
            for (int z = nums1.length - 1;z > j; z--) {
                nums1[z] = nums1[z - 1];
            }
            nums1[j] = nums2[i];
        }
    }
}