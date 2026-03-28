#include<stdio.h>

int addition(int *x, int *y){
    int a = *x;
    int b = *y;

    while (b != 0) {
        int carry = (a & b) << 1;
        printf("%d : \n",carry);
        a = a ^ b;
        b = carry;
    }

    printf("%d", a);
    return 0;
}

int main(){
    int x = 7, y = 6;
    addition(&x, &y);
    return 0;
}