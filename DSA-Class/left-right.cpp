#include <iostream>
#include <stdio.h>
#include <conio.h>
using namespace std;

void leftright(int arr[], int n){
    int i=0, j=n-1;
    int pivot=0;
    while(i<j){
        if(arr[i]>0 && arr[j]<0){
            swap(arr[i], arr[j]);
            i++; j--;
        }
        else if(arr[i]>0 && arr[j]>0){
            j--;
        }
        else{
            i++;
        }
    }
}

int main()
{
    int arr[]={34, -4, 56, -45, 45, -34};
    leftright(arr, 6);
    for(int i=0; i<6; i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}