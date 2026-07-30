class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int count = 0, base = 1;
        while (n > 8) {
            count += base * 8;
            n -= 8;
            base++;
        }
        count += n * base;
        return count;
    }
}