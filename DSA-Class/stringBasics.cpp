#include <iostream>
#include <stdio.h>
#include <conio.h>
using namespace std;

int length(char s[]){
    int len=0;
    char *p=&s[0];
    while(*p!='\0'){
        len++;
        p+=1;
    }
    return len;
}

void reverse(char s[]){
    char *p=&s[0];
    int len=length(s);
    char *q=&s[len-1];

    while(p<q){
        char temp=*p;
        *p=*q;
        *q=temp;
        p+=1; q-=1;
    }
}

void concat(char s1[], char s2[]){
    char *p=&s1[0];
    while(*p!='\0'){
        p+=1;
    }
    char *q=&s2[0];
    while(*q!='\0'){
        *p=*q;
        p+=1;
        q+=1;
    }
    *p='\0';
}

void copy(char s1[], char s2[]){
    char *p=&s1[0];
    char *q=&s2[0];
    while(*q!='\0'){
        *p=*q;
        p+=1;
        q+=1;
    }
    *p='\0';
}

bool compare(char s1[], char s2[]){
    char *p=s1;
    char *q=s2;
    while(*p!='\0' && *q!='\0'){
        if(*p!=*q) return false;
        p+=1;
        q+=1;
    }
    if((*p=='\0' && *q!='\0') || (*p!='\0' && *q=='\0')) return false;
    return true;
}

void strncat(char s1[], char s2[], int n){
    char *p=s1;
    char *q=s2;
    while(*p!='\0'){
        p+=1;
    }
    int i=0;
    while(*q!='\0' && i<n){
        *p=*q;
        p+=1;
        q+=1;
        i++;
    }
    *p='\0';
}

void strncpy(char s1[], char s2[], int n){
    char *p=s1;
    char *q=s2;
    int i=0;
    while(*q!='\0' && i<n){
        *p=*q;
        p++; q++;
        i++;
    }
    *p='\0';
}

int main()
{
    char s[]="Vishal";
    char s2[]="Hello";
    // cout<<length(s);
    // reverse(s);
    // cout<<s;
    strncat(s,s2,8);
    cout<<s<<endl;
    // copy(s2,s);
    // cout<<compare(s,s);

    strncpy(s,s2,3);
    cout<<s<<endl;
    return 0;
}