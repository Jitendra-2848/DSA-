class Solution {
    public boolean check(int[] nums) {
        int x = 0, store;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                x++;
                continue;
            }
            break;
        }
        x++;
        int rotation = nums.length - x;
        if (rotation == 0) {
            return true;
        }
        store = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int check = nums[(i + x) % nums.length];
            if (store > check) {
                return false;
            }
            store = check;
        }
        return true;

    }
}