class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for (char x : word.toCharArray()) {
            freq[x - 'a']++;
        }
        Arrays.sort(freq);
        int ans = 0, pushFreq = 1, count = 0;
        for (int i = 25; i >= 0; i--) {
            ans += freq[i] * pushFreq;
            count++;
            if (count == 8) {
                count = 0;
                pushFreq++;
            }
        }
        return ans;
    }
}