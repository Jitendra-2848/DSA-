class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<List<Integer>> unique = new HashSet<>();
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            map.clear();
            for (int j = i + 1; j < nums.length; j++) {
                int diff = -(nums[i] + nums[j]);
                if (map.containsKey(diff)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], diff);
                    Collections.sort(temp);
                    unique.add(temp);
                } else {
                    map.put(nums[j], j);
                }
            }
        }

        arr.addAll(unique);
        return arr;
    }
}