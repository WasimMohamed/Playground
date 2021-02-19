#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str;
  cin>>str;
  int r;
  cin>>r;
  if(str=="front")
  {
    if(r==1)
    {
      cout<<"Left Handed";
    }
    else
      cout<<"Right Handed";
  }
  else
  {
    if(r==1)
    {
      cout<<"Right Handed";
    }
    else
      cout<<"Left Handed";
  }
  return 0;
}
