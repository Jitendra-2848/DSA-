class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
                if(board[i][n-1] == 'O') Dfs(board,i,n-1);
                if(board[i][0] == 'O') Dfs(board,i,0);
        }
        for (int i = 0; i < n; i++) {
                if(board[0][i] == 'O') Dfs(board,0,i);
                if(board[m-1][i] == 'O') Dfs(board,m-1,i);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                if(board[i][j] == 'S'){
                    board[i][j] = 'O';
                }
            }
        }
    }
    static void Dfs(char[][] graph,int i ,int j){
        int m = graph.length;
        int n = graph[0].length;
        if(i < 0 || j < 0 || i >= m || j >= n || graph[i][j] == 'X' || graph[i][j] == 'S'){
            return;
        }
        graph[i][j] = 'S';
        Dfs(graph,i-1,j);
        Dfs(graph,i+1,j);
        Dfs(graph,i,j-1);
        Dfs(graph,i,j+1);
    }
}