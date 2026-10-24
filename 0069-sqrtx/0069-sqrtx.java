class Solution {
    public int mySqrt(int x) {
        int i = 0,j = x,ans = 1;
        while(i <= j){
            int mid = i + (j - i)/2;
            if((long)mid * mid < x){
                ans = mid;
                i = mid + 1;
            }else if((long)mid * mid == x){
                return mid;
            }else{
                j = mid - 1;
            }
        }
        return ans;
    }
}