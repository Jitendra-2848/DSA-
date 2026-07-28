class Solution {
    public String smallestPalindrome(String s) {
        if (s == null || s.isEmpty())
            return "";
        int i, j;
        char[] arr = s.toCharArray();
        Arrays.sort(arr, 0, arr.length / 2);
        i = s.length() / 2 - 1;

        if (s.length() % 2 == 0)
            j = s.length() / 2;
        else
            j = s.length() / 2 + 1;
        for (; j < s.length() && i >= 0; j++, i--) {
            arr[j] = arr[i];
        }
        return new String(arr);
    }
}