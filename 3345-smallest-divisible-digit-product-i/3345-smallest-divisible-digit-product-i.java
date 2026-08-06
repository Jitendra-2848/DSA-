class Solution {
    public int smallestNumber(int n, int t) {
        for (int i = n; i <= 100; i++) {
            int x = i;
            int count = 1;
            while(x != 0){
                count *= x % 10;
                x = x / 10;
            }
            if(count % t == 0){
                return i;
            }
        }
        return -1;
    }
}