class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> set = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.containsKey(nums[i])) {
                int x = Math.abs(i - set.get(nums[i]));
                if (x <= k) {
                    return true;
                }
            }
            set.put(nums[i], i);
        }
        return false;
    }
}