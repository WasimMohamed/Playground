#include<iostream>
using namespace std;
struct complex
{
 int a,b;
};
int main()
{
 int N,a,b,c,d;
 cin>>N;
 if(N>3 || N<0)
 {
   cout<<"Invalid choice";
   return 0;
 }
 cin>>a>>b>>c>>d;
 if(N==1)
 {
   cout<<a+c;
   if(b+d>=0)
     cout<<"+";
   cout<<b+d<<"i";
 }
 else if(N==2)
 {
   cout<<a-c;
   if(b-d>=0)
     cout<<"+";
   cout<<b-d<<"i";
 }
 else
 {
   cout<<a*c-b*d;
   if(b*c+a*d>=0)
     cout<<"+";
   cout<<b*d+a*d<<"i";
 }
}