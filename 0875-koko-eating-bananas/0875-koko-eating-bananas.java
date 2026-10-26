class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i = 1;
        int j = 0;
        for (int k = 0; k < piles.length; k++) {
            if (j <= piles[k]) {
                j = piles[k];
            }
        }
        int small = j;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            long total = 0;
            for (int x = 0; x < piles.length; x++) {
                total += Math.ceil((double) piles[x]/mid);
            }
            if (total <= h) {
                small = mid;
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return small;
    }
}