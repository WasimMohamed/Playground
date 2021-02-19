#include<iostream>
using namespace std;
int main()
{
  int n=0,arr[10];
  while(cin>>arr[n])
    n++;
  n--;
  for(int i=0;i<n;i++)
  {
    int f=0;
    for(int j=0;j<i;j++)
      if(arr[i]==arr[j])
      {
        f=1;
        break;
      }
    if(f==0)
      cout<<arr[i]<<endl;
  }
}