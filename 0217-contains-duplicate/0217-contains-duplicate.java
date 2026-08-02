class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int x = hash.getOrDefault(nums[i],0);
            if(x == 1){
                return true;
            }
            hash.put(nums[i],1);
        }
        return false;
    }
}