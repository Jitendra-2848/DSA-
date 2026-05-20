#include <stdio.h>
#include <stdlib.h>

/*
Problem: Two Sum
Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to target.

Approach:
- Brute-force: Check all pairs of numbers.
- Optimized (Hash Map) approach can be added later.

Time Complexity: O(n^2) for brute-force
Space Complexity: O(1) (ignoring output array)
*/

int* twoSum(int* nums, int numsSize, int target, int* returnSize){
    int* result = (int*)malloc(2 * sizeof(int)); // store indices
    for(int i = 0; i < numsSize; i++){
        for(int j = i + 1; j < numsSize; j++){
            if(nums[i] + nums[j] == target){
                result[0] = i;
                result[1] = j;
                *returnSize = 2;
                return result;
            }
        }
    }
    *returnSize = 0;
    return NULL;
}

int main(){
    int nums[] = {2,7,11,15};
    int target = 9;
    int returnSize;
    int* res = twoSum(nums, 4, target, &returnSize);
    
    if(res != NULL){
        printf("[%d, %d]\n", res[0], res[1]);
        free(res);
    } else {
        printf("No two sum solution found.\n");
    }

    return 0;
}