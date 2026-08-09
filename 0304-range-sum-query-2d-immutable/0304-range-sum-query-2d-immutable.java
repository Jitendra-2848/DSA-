class NumMatrix {

    int[][] matrix;

    public NumMatrix(int[][] matrix) {
        int[][] x = new int[matrix.length + 1][matrix[0].length + 1];
        if (matrix.length == 0) {
            this.matrix = x;
            return;
        }
        for (int i = 1; i <= matrix.length; i++) {
            for (int j = 1; j <= matrix[0].length; j++) {
                x[i][j] = matrix[i - 1][j - 1]
                        + x[i - 1][j]
                        + x[i][j - 1]
                        - x[i - 1][j - 1];
            }
        }

        this.matrix = x;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {

        return this.matrix[row2 + 1][col2 + 1]
                - this.matrix[row1][col2 + 1]
                - this.matrix[row2 + 1][col1]
                + this.matrix[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */