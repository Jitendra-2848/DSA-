class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int x = DfsUtil(grid, i, j);
                    if(x > count){
                        count = x;
                    }
                }
            }
        }
        return count;
    }

    static int DfsUtil(int[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0) {
            return 0;
        }

        grid[i][j] = 0;
        return 1 
        + DfsUtil(grid, i, j - 1)
        + DfsUtil(grid, i, j + 1)
        + DfsUtil(grid, i + 1, j)
        + DfsUtil(grid, i - 1, j);
    }
}
