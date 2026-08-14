class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Set<Integer> map = new HashSet<>();
        for(int num : nums){
            map.add(num);  
        }
        int count = 0;
        for(int num : map){
            if(!map.contains(num - 1)){
                int c = 1;
                int x = num;
                while(map.contains(x + 1)){
                    x++;
                    c++;
                }
                count = max(count,c);
            }
        }
        return count;
    }
    static int max(int count,int c){
        if(count < c){
            return c;
        }
        return count;
    }
}