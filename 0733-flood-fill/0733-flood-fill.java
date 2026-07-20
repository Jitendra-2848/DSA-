class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int selected_color = image[sr][sc];

        if (selected_color == color) {
            return image;
        }

        Dfs(image, sr, sc, color, selected_color);

        return image;
    }

    static void Dfs(int[][] image, int sr, int sc, int color, int selected_color) {
        int m = image.length;
        int n = image[0].length;

        if (sr < 0 || sc < 0 || sr >= m || sc >= n || image[sr][sc] != selected_color) {
            return;
        }

        image[sr][sc] = color;

        Dfs(image, sr - 1, sc, color, selected_color);
        Dfs(image, sr + 1, sc, color, selected_color);
        Dfs(image, sr, sc - 1, color, selected_color);
        Dfs(image, sr, sc + 1, color, selected_color);
    }
}