class Solution {
    public String longestCommonPrefix(String[] strs) {
         if(strs.length == 0){
            return "";
        }
        char[] a = strs[0].toCharArray();
        int count = Integer.MAX_VALUE;
        for (String str : strs) {
            int i = 0;
            for (char x : str.toCharArray()) {
                if (a.length > i && a[i] == x) {
                    i++;
                    continue;
                }
                break;
            }
            if (count > i) {
                count = i;
            }
        }
        char[] b = new char[count];
        for (int i = 0; i < count; i++) {
            b[i] = a[i];
        }
        return new String(b);
    }
}