class Solution {
    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == 1){
                    grid[i][j] = 2;
                    count += findPeri(grid,i,j);
                    grid[i][j] = 1;
                }
            }
        }
        return count;
    }

    static int findPeri(int[][] grid, int i, int j) {
         int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0) {
            return 1;
        }
        else if(grid[i][j] == 1){
            return 0;
        }

        return findPeri(grid, i - 1, j)
                + findPeri(grid, i + 1, j)
                + findPeri(grid, i, j - 1)
                + findPeri(grid, i, j + 1);
    }
}