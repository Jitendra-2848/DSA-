class Solution {
    public int trap(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxleft = 0;
        int maxright = 0;
        int totalWater = 0;
        while (i < j) {
            maxleft = Math.max(maxleft, height[i]);
            maxright = Math.max(maxright, height[j]);
            if (maxleft < maxright) {
                totalWater += maxleft - height[i];
                i++;
            } else {
                totalWater += maxright - height[j];
                j--;
            }
        }
        return totalWater;
    }
}