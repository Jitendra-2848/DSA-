#include<stdio.h>
/*
    Time complexity: O(n)
    Space complexity: O(1)
    
    The function compares each element with the previous one; if it is not the same, 
    it places the element at index k and increments k, otherwise it skips the element.
*/

int removeDuplicates(int* nums,int numsSize) {
    int k = 1;
    for(int i=1;i<numsSize;i++){
        if(nums[i] != nums[i-1]){
            nums[k] = nums[i];
            k++;
        }
    }
    return k;
}

int main(){
    int arr[] = {1,2,2,3,3,4,5,5};
    int length = sizeof(arr) / sizeof(arr[0]);
    int k_length = removeDuplicates(arr,length);
    int i = 0;
    printf("Unqiue Array : ");
    while(i<k_length){
        printf("%d ",arr[i]);
        i++;
    };
    
    
    return 0;
}