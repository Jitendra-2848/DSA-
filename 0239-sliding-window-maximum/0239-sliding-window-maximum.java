class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] arr = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            while(deque.size() > 0 && deque.peekFirst() <= i - k){
                deque.pollFirst();
            }

            while(deque.size() > 0 && nums[deque.peekLast()] <= nums[i]){
                deque.pollLast();
            }

            deque.offerLast(i);

            if(i >= k - 1){
                arr[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return arr;
    }
}