#include <iostream>
#include <stdio.h>
#include <conio.h>
using namespace std;

void rotate(int arr[], int n, int k){
    k=k%n;
    int temp[k];
    for(int i=0; i<k; i++){
        temp[k-1-i]=arr[n-1-i];
    }
    for(int i=n-1; i>=0; i--){
        arr[i]=arr[i-k];
    }
    for(int i=0; i<k; i++){
        arr[i]=temp[i];
    }
}

// void rotateWithoutSpace(int arr[], int n, int k){
//     int i=0, j=n-k;
//     while(j<n){
//         swap(arr[i], arr[j]);
//         i++; j++;
//     }
//     i=i+1;
//     j=n-k;

// }

void reverse(int arr[], int n){
    int *p=&arr[0];
    int *q=&arr[n-1];
    while(p<q){
        int temp=*p;
        *p=*q;
        *q=temp;
        p+=1;
        q-=1;
    }
}

int missing(int arr[], int n){
    int d1=arr[1]-arr[0];
    int d2=arr[2]-arr[1];
    int d3=arr[3]-arr[2];
    int diff=(d1==d2)?d1:(d1==d3?d1:d2);
    for(int i=0; i<n-1; i++){
        if(arr[i+1]!=arr[i]+diff) return arr[i]+1;
    }
    return -1;
    // int sum=(arr[n-1]/2)*(2*arr[0]+(arr[0]-1)*diff);
    // cout<<sum<<endl;
    // int asum=0;
    // for(int i=0; i<n; i++){
    //     asum+=arr[i];
    // }
    // return sum=asum;
}

int main()
{
    int n=5;
    int arr[]={1,2,4,5};
    // rotate(arr,5, 6);
    // reverse(arr, 5);
    // for(int i=0;i<n;i++){
    //     cout<<arr[i]<<" ";
    // }
    cout<<missing(arr,5);
    return 0;
}