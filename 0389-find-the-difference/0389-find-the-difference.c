char findTheDifference(char* s, char* t) {
    char ans = t[0];
    for(int i = 0;i<strlen(s);i++){
        ans ^= s[i] ^ t[i+1];  
    }
    return ans;
}