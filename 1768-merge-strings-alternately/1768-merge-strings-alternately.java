class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        int i;
        for(i = 0;i<Math.min(word1.length(),word2.length());i++){
             s.append(word1.charAt(i));
             s.append(word2.charAt(i));
        }
        while(i < word1.length()){
            s.append(word1.charAt(i));
            i++;
        }
        while(i < word2.length()){
            s.append(word2.charAt(i));
            i++;
        }
        return new String(s);
    }
}