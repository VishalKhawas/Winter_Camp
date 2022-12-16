#include <iostream>
#include <stdio.h>
#include <conio.h>
using namespace std;

int compare(char s1[], char s2[]){
    char *p=s1;
    char *q=s2;
    while(*p!='\0' && *q!='\0'){
        if(*p<*q) return -1;
        else if(*p>*q) return 1;
        p+=1;
        q+=1;
    }
    if((*p=='\0' && *q!='\0')) return -1;
    else if((*p!='\0' && *q=='\0')) return 1;
    return 0;
}

void sortNames(char s[][50], int n){
    for(int i=0; i<n; i++){
        for(int j=0; j<n-1-i; j++){
            if(compare(s[j],s[j+1])>0) swap(s[j],s[j+1]);
        }
    }
}

int main()
{
    char name[][50]={"Vishal", "Khawas", "Hello", "World", "Worls"};
    sortNames(name, 5);
    for(auto i: name){
        cout<<i<<" ";
    }
    return 0;
}