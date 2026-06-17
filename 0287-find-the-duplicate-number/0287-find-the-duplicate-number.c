int findDuplicate(int* nums, int numsSize) {
    int *arr = (int *)calloc(numsSize,sizeof(int));
    for(int i = 0;i<numsSize;i++){
        arr[nums[i] - 1] += 1; 
    }
    for(int i = 0;i<numsSize;i++){
        if(arr[i] > 1){
            return i + 1;
        }
    }
    return -1;
}