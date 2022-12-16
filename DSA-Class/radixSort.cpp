#include <iostream>
#include <stdio.h>
#include <conio.h>
using namespace std;

void radixSort(int arr[], int n){
    int maxdig=0;
    int aux[n];
    for(int i=0; i<n; i++) aux[i]=arr[i];
    for(int i=0; i<n; i++){
        int dig=0;
        while(aux[i]!=0){
            dig++;
            aux[i]=aux[i]/10;
        }
        if(dig>maxdig) maxdig=dig;
    }

    for(int i=0; i<n; i++) aux[i]=arr[i];

    for(int k=0; k<maxdig; k++){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1-i; j++){
                if((aux[j]%10)>(aux[j+1]%10)){
                    swap(arr[j],arr[j+1]);
                }
            }
        }
        for(int fg=0; fg<n; fg++){
        cout<<arr[fg]<<" ";
        }
        cout<<endl;
        for(int i=0; i<n; i++) aux[i]=aux[i]/10;
    }
}

int main()
{
    int arr[]={58,46,5,943,27,44,21,92,14};
    radixSort(arr, 9);
    // for(int i:arr){
    //     cout<<i<<" ";
    // }
    return 0;
}