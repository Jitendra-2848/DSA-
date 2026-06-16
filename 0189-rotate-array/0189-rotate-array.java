class Solution {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;

        Reverse(nums,0,nums.length - 1);
        Reverse(nums,0,k - 1);
        Reverse(nums,k,nums.length - 1);
    }
    static void Reverse(int[] nums,int s,int e){
        while(e > s){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}