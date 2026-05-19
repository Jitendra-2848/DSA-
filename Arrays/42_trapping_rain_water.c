#include<stdio.h>

int max(int a,int b){
    return a > b ? a : b;
}
int trap(int* height, int heightSize) {
    int i = 0;
    int j = heightSize - 1;
    int maxleft = 0;
    int maxright = 0;
    int totalWater = 0;
    while(i < j){
      maxleft = max(maxleft,height[i]);
      maxright = max(maxright,height[j]);
      if(maxleft < maxright){
        totalWater += maxleft - height[i];
        i++;
      }else{
        totalWater += maxright - height[j];
        j--;
      }
    }
    return totalWater;
}

int main(){
    int height[] = {0,1,0,2,1,0,1,3,2,1,2,1}; //Answer : 6
    int heightSize = sizeof(height)/sizeof(height[0]);
    int result = trap(height,heightSize);
    printf("%d",result);
    return 0;
}