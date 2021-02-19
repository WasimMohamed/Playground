#include<iostream>
using namespace std;
int main()
{
   int n,i=0,j,max,a[100],y,x;
 cout<<"Before inserting:\n";
while(1)
{
  cin>>n;
  if(n<0)
    break;
  else
  {
  a[i++]=n;
    cout<<n<<endl;
  }
}
 cin>>y>>x;
 cout<<"Enter the value and position\nAfter inserting:\n";
 for(j=0;j<y;j++)
   cout<<a[j]<<"\n";
 cout<<x<<"\n";
 for(j=y;j<i;j++)
   cout<<a[j]<<"\n";
 
 return 0;
}
