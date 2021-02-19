#include<iostream>
using namespace std;
int main()
{
int n,i=0,j,max,a[100],y,x,k;
while(1)
{
  cin>>n;
  if(n<0)
    break;
  else
  {
  a[i++]=n;
  }
}
 max=0;
 for(k=0;k<i-1;k++)
 {
   for(j=k+1;j<i;j++)
     if(a[j]+a[k]>max)
       max=a[j]+a[k];
 }
 cout<<max;
 return 0;
}