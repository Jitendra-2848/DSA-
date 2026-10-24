class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        int i = 0,j = m,row = 0;
        while(i <= j){
            int mid = i + (j-i)/2;
            if(matrix[mid][n] == target){
                return true;
            }else if(matrix[mid][n] < target){
                i = mid + 1;
            }else {
                row = mid;
                j = mid - 1; 
            }
        }
        i = 0;
        j = n;
        while(i <= j){
            int mid = i + (j-i)/2;
            if(matrix[row][mid] == target){
                return true;
            }else if(matrix[row][mid] < target){
                i = mid + 1;
            }else {
                j = mid - 1; 
            }
        }
        return false;
    }
}