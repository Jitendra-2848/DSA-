class Solution {
    public boolean searchMatrix(int[][] num, int target) {
        int m = num.length;
        int n = num[0].length;
        int i = 0, j = m * n - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            int row = mid / n,col = mid % n; 
            if(num[row][col] == target){
                return true;
            }else if(num[row][col] < target){
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        return false;
    }
}
