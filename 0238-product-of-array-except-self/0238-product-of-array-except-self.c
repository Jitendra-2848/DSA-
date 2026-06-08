/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* productExceptSelf(int* nums, int numsSize, int* returnSize) {
    int* prefix = (int *)malloc(numsSize * sizeof(int));
    int* suffix = (int *)malloc(numsSize * sizeof(int));
    int* answer = (int *)malloc(numsSize * sizeof(int));
    int i;
    *returnSize = numsSize;
    for(i = numsSize - 1;i >= 0;i--){
        if(i == numsSize - 1){
            suffix[i] = 1;
            continue;
        }
        suffix[i] = suffix[i + 1] * nums[i + 1];
    }
    for(i = 0;i < numsSize;i++){
        if(i == 0){
            prefix[i] = 1;
            continue;
        }
        prefix[i] = prefix[i - 1] * nums[i - 1];
    }
    i = 0;
    while(i < numsSize){
        answer[i] = prefix[i] * suffix[i];
        i++;
    }
    free(prefix);
    free(suffix);
    return answer;
}