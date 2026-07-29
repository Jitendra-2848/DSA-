class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        if(s.length() != t.length()){
            return false;
        }
        boolean flag = true;
        for(int i = 0;i<s.length();i++){
            flag = false;
            for(int j = 0;j<t.length();j++){
                if(a[i] == b[j]){
                    flag = true;
                    b[j] = '0';
                    break;
                }
            }
            if(!flag){
                return flag;
            }
        }
        return flag;
    }
}