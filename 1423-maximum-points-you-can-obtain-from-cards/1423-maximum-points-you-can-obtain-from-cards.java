class Solution {
    public int maxScore(int[] nums, int z) {
        int res = 0;
            int sum = 0,j,k;
            for (j = 0; j < z; j++) {
                sum += nums[j];
                res = Math.max(res, sum);
            }
            for (k = nums.length - 1; k > nums.length - 1 - z; k--) {
                sum -= nums[--j];
                sum += nums[k];
                res = Math.max(res, sum);
            }
        return res;
    }
}