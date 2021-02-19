
#include<iostream>
using namespace std;
int main()
{
 int N,zind=0,maxcount=0;
 cin>>N;
 int arr[N],zeroes[N];
 for(int i=0;i<N;i++)
 {
   cin>>arr[i];
   if(arr[i]==0)
     zeroes[zind++]=i;
 }
 if(zind==0)
 {
   cout<<N;
   return 0;
 }
 for(int i=0;i<zind;i++)
 {
   arr[zeroes[i]]=1;
   int count=0,j=0;
   while(j<N)
   {
     if(arr[j])
       count++;
     else
       maxcount=maxcount<count?count:maxcount,count=0;
     j++;
   }
   maxcount=maxcount<count?count:maxcount;
   arr[zeroes[i]]=0;
 }
 cout<<maxcount;
}