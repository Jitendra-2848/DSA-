class Solution {
    public int maximumProduct(int[] nums) {
        int firstmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int prod1,prod2;
        int firstmin = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;
        for(int num : nums){
            if(num > firstmax){
                third = secondmax;
                secondmax = firstmax;
                firstmax = num;
            }
            else if(num > secondmax){
                third = secondmax;
                secondmax = num;
            }
            else if(num > third){
                third = num;
            }

            if(firstmin > num){
                secondmin = firstmin;
                firstmin = num;
            }
            else if(secondmin > num){
                secondmin = num;
            }

        }
        prod1 = firstmax * secondmax * third; 
        prod2 = firstmin * secondmin * firstmax; 
        int result = Math.max(prod1,prod2);
        return result; 
    }   
  

}