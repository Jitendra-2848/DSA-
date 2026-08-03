class Solution {
    public boolean check(int[] nums) {
        // Now we are counting the breaks in the array. A rotated sorted array usually has 1 break, an invalid array has 2 or more breaks, and a completely sorted array has 0 breaks
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i] > nums[(i+1) % n]){
                count++;
            }
        }
        return count <= 1;
    }
}