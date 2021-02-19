#include<iostream>
using namespace std;
void stockSpan(int n,int *a)
{
 int b[n],c=0,i,d=2;
 b[0]=1;
 for(i=0;i<n;i++)
 {
  if(a[i]>a[i+1])
    b[i+1]=1;
  else if(a[i]<a[i+1]&&c==0)
  {
    b[i+1]=d;
    c++;
  }
  else
  {
    b[i+1]=d+2;
    d+=2;
  }
   
 }
 for(i=0;i<n;i++)
   cout<<b[i]<<"\n";
}
int main()
{
 int n;
 cin>>n;
 int a[n],i;
 for(i=0;i<n;i++)
 {
  cin>>a[i];
 }
 stockSpan(n,a);
}
