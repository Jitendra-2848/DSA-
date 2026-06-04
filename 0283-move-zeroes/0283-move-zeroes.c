void moveZeroes(int* nums, int numsSize) {
    int nonZero = 0;
    for(int i = 0;i<numsSize;i++){
        if(nums[i] == 0){
            continue;
        }
        nums[nonZero++] = nums[i];
    }
    for(int i = nonZero;i<numsSize;i++){
        nums[i] = 0;
    }
}