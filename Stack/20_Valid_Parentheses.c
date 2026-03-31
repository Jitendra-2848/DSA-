#include<stdio.h>
#include<stdbool.h>
#include<string.h>
#include<stdlib.h>
#define max 10
int top;

// Time Complexity: O(n)
// Space Complexity: O(n)

bool valid_parantheses(char str[]){
    top = -1;
    int len = strlen(str);
    char *arr = (char *)malloc(len * sizeof(char));
    for(int i=0;str[i] != '\0';i++){
        if(str[i] == '[' || str[i] == '{' || str[i] == '('){
            arr[++top] = str[i];
        }
        else{
            if(top == -1) return false;
            if( (str[i] == ']' && arr[top] == '[') || 
                (str[i] == '}' && arr[top] == '{') ||
                (str[i] == ')' && arr[top] == '(')){
                    top--;
            }
            else{
                free(arr);
                return false;
            }
        }
    }
    return top == -1;
}
int main(){
    char str[] = "([{}])(){}";
    bool x = valid_parantheses(str);
    printf("\n%d",x);
    return 0;
}