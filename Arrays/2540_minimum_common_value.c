#include<stdio.h>
//Time complexity : O(n)
//Space complexity : O(1)
int getCommon(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int i = 0;
    int j = 0;

    while (i < nums1Size && j < nums2Size) {
        if (nums1[i] == nums2[j]) {
            return nums1[i];
        }

        if (nums1[i] < nums2[j]) {
            i++;
        } else {
            j++;
        }
    }

    return -1;
}

int main() {
    int arr1[] = {1,2,3,4,5};
    int arr2[] = {3,4}; // Answer will be 3
    int num1Size = sizeof(arr1)/sizeof(arr1[0]);
    int num2Size = sizeof(arr2)/sizeof(arr2[0]);

    int result = getCommon(arr1, num1Size, arr2, num2Size);
    printf("%d", result);
    return 0;
}