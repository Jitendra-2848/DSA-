class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;

        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = piles[i];
        }

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {

                int j = i + len - 1;

                int takeLeft = piles[i] - dp[i + 1];
                int takeRight = piles[j] - dp[i];

                dp[i] = Math.max(takeLeft, takeRight);
            }
        }

        return dp[0] >= 0;
    }
    
}