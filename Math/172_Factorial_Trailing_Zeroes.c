#include<stdio.h>


// Time Complexity: O(log n)
// Space Complexity: O(1)

int trailingZeroes(int n) {
    int rem = 0;
    while(n > 0){
        n = n / 5;
        rem = rem + n;
    }
    return rem;
}
int main(){
    int n;
    printf("Enter a number : ");
    scanf("%d",&n);
    int zeroes = trailingZeroes(n);
    printf("\nNumber of trailing zeroes is : %d",zeroes);

    return 0;
}