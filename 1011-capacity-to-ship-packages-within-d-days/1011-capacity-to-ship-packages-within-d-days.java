class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = Integer.MIN_VALUE, r = 0;
        for (int i : weights) {
            if (l < i) {
                l = i;
            }
            r += i;
        }
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int ship = 1;
            int load = 0;
            for(int i = 0;i<weights.length;i++){
                if(load + weights[i] > mid){
                    ship++;
                    load = 0;
                }
                load += weights[i];
            }
            if(ship <= days){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
}