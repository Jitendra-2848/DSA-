class Solution {
    public int removeElement(int[] nums, int vnumsl) {
        int k = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == vnumsl) {
                k = i;
                while (k < nums.length && nums[k] == vnumsl) {
                    k++;
                }
                if (k >= nums.length) {
                    return count;
                }
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
            }
            count++;
        }
        return count;
    }
}