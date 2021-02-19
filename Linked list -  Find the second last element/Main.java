#include<iostream>
using namespace std;
int main()
{
  int arr[10],n=0;
  while(cin>>arr[n])
    n++;
  n--;
  if(n<2)
    cout<<"There is no second last element in the list";
  else
    cout<<arr[n-2]<<" is the second last element in the list";
}
