#include<stdio.h>

// Time Complexity: O(log n)
// Space Complexity: O(1)
int hammingWeight(int n) {
    int count = 0;
    while(n != 0){
        count += (n & 1);
        n = n >> 1;
    }
    return count;
}
int main() {
    int n;
    printf("Enter n : ");
    scanf("%d",&n);
    printf("%d",hammingWeight(n));
    return 0;
}