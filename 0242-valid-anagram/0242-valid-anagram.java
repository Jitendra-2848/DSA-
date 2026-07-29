class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false; 
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        int[] arr = new int[26];
        for(char x : a){
            arr[x - 'a']++;
        }
        for(char x : b){
            arr[x - 'a']--;
        }
        for(int count : arr){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}