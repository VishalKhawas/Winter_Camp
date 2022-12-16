#include <iostream>
#include <stdio.h>
#include <conio.h>
using namespace std;

int* nextGreatest(int arr[], int res[], int n){
    for(int i=0; i<n-1; i++){
        int count=0;
        for(int j=i+1; j<n; j++){
            if(arr[j]>arr[i]) count++;
        }
        res[i]=count;
    }
    res[n-1]=0;
    return res;
}

int main()
{
    int arr[]={7, 12, 6, 4, 13, 5};
    int res[6]={0};
    int *p=nextGreatest(arr,res,6);
    for(int i=0; i<6; i++){
        cout<<*p<<" ";
        p+=1;
    }
    return 0;
}