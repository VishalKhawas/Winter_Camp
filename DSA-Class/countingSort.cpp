#include <iostream>
#include <stdio.h>
#include <conio.h>
using namespace std;

void counting2Range(int arr[], int n, int s, int e){
    //in k_arr, index 0 corrospondes to s
    int k_arr[e-s+1];
    for(int i=0; i<n; i++){
        k_arr[arr[i]-s]++;
    }
    int x=0;
    for(int i=0; i<e-s+1; i++){
        for(int j=0; j<k_arr[i]; j++){
            arr[x]=i+s;
            x++;
        }
    }
}

void countingSort(int arr[], int n, int k){
    int k_arr[k+1]={0};
    for(int i=0; i<n; i++){
        k_arr[arr[i]]++;
    }
    int x=0;
    for(int i=1; i<=k; i++){
        for(int j=0; j<k_arr[i]; j++){
            arr[x]=i;
            x++;
        }
    }
}

int main()
{
    int arr[]={200, 210, 208, 207, 204};
    counting2Range(arr, 8, 200, 210);
    for(int i:arr){
        cout<<i<<" ";
    }
    return 0;
}