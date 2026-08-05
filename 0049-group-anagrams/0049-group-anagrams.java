class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hash = new HashMap<>();
        for(String str : strs){
            char[] a = str.toCharArray();
            Arrays.sort(a);
            hash.putIfAbsent(new String(a), new ArrayList<>());
            hash.get(new String(a)).add(str);
        }
        return new ArrayList<>(hash.values());
    }
}