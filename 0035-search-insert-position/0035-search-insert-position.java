class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0,j = nums.length - 1,r = nums.length;
        while(i <= j){
            int mid = i + (j-i)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                i = mid + 1;
            }else{
                r = mid;
                j = mid - 1;
            }
        }
        return r;
    }
}