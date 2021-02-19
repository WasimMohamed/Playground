#include<iostream>
using namespace std;
int main()
{
  int n,rev;
  cin>>n;
  int arr[n];
  for(int i=1;i<=n;i++)
    cin>>arr[i];
  cin>>rev;
  for(int i=rev;i>=1;i--)
    cout<<arr[i]<<" ";
  for(int i=rev+1;i<=n;i++)
    cout<<arr[i]<<" ";
}