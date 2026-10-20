class Solution {
    static boolean checkFreq(int[] a,int[] b){
        for(int i = 0;i < 26;i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int[] s1_freq = new int[26];
        for(int i = 0;i < s1.length();i++){
            s1_freq[s1.charAt(i) - 'a']++;
        }
        int r = s1.length();
        for(int i = 0;i < s2.length() - s1.length() + 1;i++){
            int[] s2_freq = new int[26];
            for(int x = i ; x < r ;x++){
                s2_freq[s2.charAt(x) - 'a']++;
            }
            if(checkFreq(s1_freq,s2_freq)){
                return true;
            }
            r++;
        }
        return false;
    }
}
