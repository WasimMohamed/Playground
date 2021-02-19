#include<iostream>
using namespace std;
class Person
{
public:
  string s1,s2;
  int n;
  void getdata()
       {
         getline(cin,s1);
         getline(cin,s2);
         cin>>n;
       }
  void putdata()
       {
         cout<<"First Name: "<<s2<<"\nLast Name: "<<s1<<"\nAge: ";
         if(n>0&&n<100)
         cout<<n;
         else
          cout<<"0";
         cout<<"\nFull Name: "<<s1<<" "<<s2;
         if(n>12&&n<20)
           cout<<"\nisTeen: "<<"True";
         else
           cout<<"\nis Teen: "<<"False";
       }
         
         
};
int main()
{
Person p;
 p.getdata();
 p.putdata();
}
