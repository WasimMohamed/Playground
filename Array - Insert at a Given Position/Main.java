#include<iostream>
using namespace std;
int main()
{
  // Type your code here
 int n;
 cin>>n;
 int arr[1000]={0};
 int pos,integer;
 int size=0;
 for(int i=0;i<n;i++)
 {
   cin>>pos>>integer;
   int a=pos;
   int index=0;
   if(arr[0]==0)
   {
     if(pos!=0)
       cout<<"Insertion failed\n";
     else{
       arr[a]=integer;
       size++;}
   }
   else
   {
     
     while(pos>1 && arr[index]!=0)
     {
       index++;
       pos--;
     }
     if(arr[index]==0)
       cout<<"Insertion failed\n";
     else
     {
       if(index==0 && a==0)
       {
         for(int j=size;j>0;j--)
           arr[j]=arr[j-1];
         arr[0]=integer;
         size++;
       }
       else
       {
         for(int j=size;j>index;j--)
           arr[j]=arr[j-1];
         arr[a]=integer;
       size++;
       }
     }
   }
 }
     
   
 
 for(int i=0;i<size;i++)
 {
   cout<<"Value at x["<<i<<"]= "<<arr[i]<<"\n";
 }
 
return 0;
}