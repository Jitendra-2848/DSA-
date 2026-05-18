#include<stdio.h>
#include<stdlib.h>
#include<string.h>

// Time complexity : O(n^2)
// Space complexity : O(n)
// sorting -> select first element -> two pointer -> Sum and compare then move pointer -> add to result

void sort(int* arr, int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

int** threeSum(int* nums, int numsSize, int* returnSize,
               int** returnColumnSizes) {
    int size = 10;
    *returnColumnSizes = (int*)malloc(size * sizeof(int));
    *returnSize = 0;
    int** result = (int**)malloc(size * sizeof(int*));
    sort(nums, numsSize);
    for (int i = 0; i < numsSize - 2; i++) {
        if (nums[i] > 0)
            break;
        if (i > 0 && nums[i] == nums[i - 1])
            continue;
        int j = i + 1;
        int k = numsSize - 1;
        while (j < k) {
            int sum = nums[i] + nums[j] + nums[k];
            if (sum > 0) {
                k--;
            } else if (sum < 0) {
                j++;
            } else {
                if (*returnSize == size) {
                    size *= 2;
                    result = realloc(result, size * sizeof(int*));
                    *returnColumnSizes =
                        realloc(*returnColumnSizes, size * sizeof(int));
                }
                result[*returnSize] = (int*)malloc(3 * sizeof(int));
                result[*returnSize][0] = nums[i];
                result[*returnSize][1] = nums[j];
                result[*returnSize][2] = nums[k];
                (*returnColumnSizes)[*returnSize] = 3;
                j++;
                k--;
                (*returnSize)++;
                while (j < k && nums[j] == nums[j - 1])
                    j++;
                while (j < k && nums[k] == nums[k + 1])
                    k--;
            }
        }
    }
    return result;
};
int main(){
    int arr[] = {-1,0,1,2,-1,-4}; //Answer :  [-1,-1,2],[-1,0,1]
    int length = sizeof(arr)/sizeof(arr[0]);
    int returnSize = 0;
    int *returnColumnSizes = 0;
    int** result = threeSum(arr,length,&returnSize,&returnColumnSizes);
    for(int i = 0;i<(returnSize);i++){
        for(int j = 0;j<returnColumnSizes[i];j++){
            printf("%d ",result[i][j]);
        }
        printf("\n");
    }
}