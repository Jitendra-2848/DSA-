class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        int candidate1 = 0;
        int candidate2 = 0;

        for (int num : nums) {
            if (candidate1 == num) {
                count1++;
            } else if (candidate2 == num) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        List<Integer> result = new ArrayList<>();
        int target = nums.length / 3;
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (candidate1 == num) {
                count1++;
            }
            if (candidate2 == num) {
                count2++;
            }
        }

        if (count1 > target) {
            result.add(candidate1);
        }
        if (count2 > target && candidate2 != candidate1) {
            result.add(candidate2);
        }

        return result;
    }
}