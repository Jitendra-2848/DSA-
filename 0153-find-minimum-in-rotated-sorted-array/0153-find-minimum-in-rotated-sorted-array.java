class Solution {
    public int findMin(int[] nums) {
        int i = 0, j = nums.length - 1;
        int res = nums[nums.length - 1];
        while (i <= j) {
            int mid = i + (j - i)/2;
            if(res >= nums[mid]){
                res = nums[mid];
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        return res;
    }
}