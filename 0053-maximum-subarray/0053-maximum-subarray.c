#include <limits.h>

int maxSubArray(int arr[], int n) {
    int max_sum = INT_MIN;
    int current_sum = 0;
    
    for (int i = 0; i < n; i++) {
        current_sum += arr[i];
        if (max_sum < current_sum) {
            max_sum = current_sum;
        }
        if (current_sum < 0) {
            current_sum = 0;
        }
    }
    return max_sum;
}