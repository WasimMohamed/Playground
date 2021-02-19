#include<iostream>
using namespace std;
int main()
{
 char a[100],b[100];
 int id,size,score[100],sum=0,i;
 cin>>a>>b>>id>>size;
 for(i=0;i<size;i++)
 {
   cin>>score[i];
 }
 cout<<a<<"\n"<<b<<"\n"<<id<<"\n";
 for(i=0;i<size;i++)
 {
   sum=sum+score[i];
 }
 int sum1=sum/size;
 if(sum1>=90 && sum1<=100)
   cout<<"O";
 else if(sum1>=80 && sum1<90)
   cout<<"E";
 else if(sum1>=70 && sum1<80)
   cout<<"A";
 else if(sum1>=55 && sum1<70)
   cout<<"P";
 else if(sum1>=40 && sum1<55)
   cout<<"D";
 else if(sum1<40)
   cout<<"T";
 
}