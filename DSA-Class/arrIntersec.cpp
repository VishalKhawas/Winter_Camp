#include <iostream>
#include <stdio.h>
#include <conio.h>
using namespace std;

int intersect(int a1[], int a2[], int a3[], int n){
    int i=0;
    int j=0;
    int k=0;

    while(i<n && j<n && k<n){
        if(a1[i]==a2[j] && a2[j]==a3[k]) return a1[i];
        else{
            if(a1[i]<=a2[j] && a1[i]<=a3[k]) i++;
            else if(a2[j]<=a1[i] && a2[j]<=a3[k]) j++;
            else k++;
        }
    }
    return -1;
}

int main()
{
    int a1[]={12,13,14,15,16};
    int a2[]={14,19,23,44,46};
    int a3[]={5,7,9,14,21};
    cout<<intersect(a1,a2,a3,5);
    return 0;
}