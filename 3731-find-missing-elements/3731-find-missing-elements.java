class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE,max =  Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(max < nums[i]){
                max = nums[i];
            }
            if(min > nums[i]){
                min = nums[i];
            }
        }
        // int n = max 
        int[] track = new int[max - min + 1];
        for(int i = 0;i<nums.length;i++){
            // nums[i] -= min;
            track[nums[i] - min] = 1;
        }
        ArrayList<Integer> x = new ArrayList<>();
        for(int i = 0;i<track.length;i++){
            if(track[i] != 1){
                x.add(i + min);
            }
        }
        return x;
    }
}