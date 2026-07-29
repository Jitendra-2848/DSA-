class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false; 
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        HashMap<Character , Integer> hash = new HashMap<>();
        for(char x : a){
            hash.put(x,hash.getOrDefault(x,0) + 1);
        }
        for(char x : b){
             if (!hash.containsKey(x)) {
                return false;
            }
            hash.put(x, hash.get(x) - 1);

            if (hash.get(x) == 0) {
                hash.remove(x);
            }
        }
        return true;
    }
}