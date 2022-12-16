#include <iostream>
#include <stdio.h>
#include <conio.h>
using namespace std;

//apply dp on it

bool subSetWithk(int arr[], int n, int k){
    if(k==0) return true;
    if(n==0) return false;
    return (subSetWithk(arr, n-1, k-arr[n-1]) || subSetWithk(arr, n-1, k));
}

int main()
{
    int arr[]={3, 7, 8, 12, 14, 5};
    cout<<subSetWithk(arr, 6, 19);
    return 0;
}