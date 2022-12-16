#include <iostream>
#include <stdio.h>
#include <conio.h>
using namespace std;
int main()
{
    int a[]={1, 2, 3, 4};
    int *p=a;
    cout<<p<<endl;

    string s="Vishal";
    char *ptr=&s[0];
    cout<<ptr<<endl;
    return 0;
}