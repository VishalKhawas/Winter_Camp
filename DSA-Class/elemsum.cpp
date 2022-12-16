#include <iostream>
#include <stdio.h>
#include <conio.h>
using namespace std;

int sum(int arr[], int n){
    static int x=0;
    if(n==1){
        x=arr[n-1];
    }
    else{
        n--;
        x= x+sum(arr, n);
    }

}

int main()
{
    int arr[]={30, 34, 45};
    cout<<sum(arr, 3);
    return 0;
}