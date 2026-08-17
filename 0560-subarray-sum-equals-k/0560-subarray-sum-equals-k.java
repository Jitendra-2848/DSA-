class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int curr = 0,res = 0;
        map.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];
            int diff = curr - k;
            res += map.getOrDefault(diff,0);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        return res;
    }
}