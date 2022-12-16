#include <iostream>
#include <stdio.h>
#include <conio.h>
using namespace std;

void sortCharBubble(char s[], int n){
    for(int i=0; i<n; i++){
        for(int j=0; j<n-1-i; j++){
            if(s[j]>s[j+1]) swap(s[j],s[j+1]);
        }
    }
}

int main()
{
    char str[]={'M','H','P','A','D','Z','T','G'};
    sortCharBubble(str,8);
    for(char c: str){
        cout<<c<<" ";
    }
    return 0;
}