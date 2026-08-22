class Solution {
    public int maxArea(int[] height) {
        int store = Integer.MIN_VALUE;
        int i = 0, j = height.length - 1;
        while (i < j) {
            int x = Math.min(height[i],height[j]);
            int width = j - i;
            store = Math.max(store,x*width);
            if(height[i] < height[j]){
                i++; 
            }else{
                j--;
            }
        }
        return store;
    }
}