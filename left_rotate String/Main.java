#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char s[1001];
  scanf("%s",s);
  int a;
  cin>>a;
  for(int i=a;i<strlen(s);i++)
    cout<<s[i];
  for(int i=0;i<a;i++)
    cout<<s[i];
}