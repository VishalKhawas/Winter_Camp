#include <iostream>
#include <stdio.h>
#include <conio.h>
using namespace std;

void merge(int a1[], int a2[], int arr[], int len1, int len2){
    int i=0, j=0, k=0;
    while(i<len1 && j<len2){
        if(a1[i]<a2[j]){
            arr[k]=a1[i];
            i++;
        }
        else{
            arr[k]=a2[j];
            j++;
        }
        k++;
    }
    for(;i<len1; i++){
        arr[k]=a1[i];
        k++;
    }
    for(;j<len2; j++){
        arr[k]=a2[j];
        k++;
    }
}

void mergeSort(int arr[], int len){
    if(len<2) return;
    int mid=len/2;
    int i=0, j=mid+1;
    int len1=mid+1;
    int len2=len-mid-1;
    int arrL[mid+1];
    int arrR[len-mid-1];
    for(;i<=mid; i++) arrL[i]=arr[i];
    for(;j<len; j++) arrR[j-mid-1]=arr[j];
    mergeSort(arrL, len1);
    mergeSort(arrR, len2);
    merge(arrL, arrR, arr, len1, len2);
}

int main()
{
    int arr[]={2,1,4,2,6,3,6,8};
    int n=8;
    for(int i=0; i<n; i++){
        cout<<arr[i]<<" ";
    }
    mergeSort(arr, n);
    for(int i=0; i<n; i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}