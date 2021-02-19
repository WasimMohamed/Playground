#include<iostream>
using namespace std;
int main()
{
  std::cout<<"Original order:"<<"\n";
  int a,arr[50],s=0,d=0;
  while(std::cin>>a)
  {
    arr[s]=a;
    s++;
    d++;
  }
  for(int i=0;i<d-1;i++)
    std::cout<<arr[i]<<"\n";
  std::cout<<"Reverse order:";
  for(int i=d-2;i>=0;i--)
    std::cout<<"\n"<<arr[i];
}