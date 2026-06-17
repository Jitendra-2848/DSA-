/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findDisappearedNumbers(int* nums, int numsSize, int* returnSize) {
    int* arr = (int *)calloc(numsSize,sizeof(int));
    *returnSize = 0;
    for(int i = 0;i<numsSize;i++){
        arr[nums[i] - 1] = 1;
    }
    for(int i = 0;i<numsSize;i++){
        if(arr[i] == 0){
            nums[(*returnSize)++] = i + 1; 
        }
    }
    free(arr);
    return nums;
}