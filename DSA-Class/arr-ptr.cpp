#include <iostream>
#include <stdio.h>
#include <conio.h>
using namespace std;

int count(int arr[], int n){
    int *p=arr;
    int **ptr=&p;
    int count=0;
    while(n--){
        if((**ptr)%2==0) count++;
        (*ptr)+=1;
    }
    return count;
}

int main()
{
    int a[]={10, 21, 22, 45, 23, 78};
    cout<<count(a, 6);
    return 0;
}