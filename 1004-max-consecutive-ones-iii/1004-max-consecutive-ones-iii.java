class Solution {
    public int longestOnes(int[] nums, int k) {
        int count = 0, l = 0;
        int res = 0;
        int zero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
            }
            if (zero > k) {
                if (nums[l] == 0) {
                    zero--;
                }
                l++;
            }
            res = Math.max(i - l + 1, res);
        }
        return res;
    }
}