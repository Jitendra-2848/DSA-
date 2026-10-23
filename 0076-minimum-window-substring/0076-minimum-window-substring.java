class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()){
            return "";
        }
        int[] freq = new int[256];
        for(char c : t.toCharArray()){
            freq[c]++;
        }
        int i = 0;
        int start = 0;
        int required = t.length();
        int min = Integer.MAX_VALUE;
        for(int j = 0;j < s.length();j++){
            char c = s.charAt(j);
            if(freq[c] > 0){
                required--;
            }
            freq[c]--;
            while(required == 0){
                int len = j - i + 1;
                if(len < min){
                    min = len;
                    start = i;
                }
                freq[s.charAt(i)]++;
                if(freq[s.charAt(i)] > 0){
                    required++;
                }
                i++;
            }
        } 
        return min == Integer.MAX_VALUE ? "" : s.substring(start,start + min);
    }
}