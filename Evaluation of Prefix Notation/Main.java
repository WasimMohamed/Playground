#include<iostream>
#include<string.h>
using namespace std;
int stack[100],top=-1;
int main()
{
  char str[100];
  cin.getline(str,100);
  for(int i=strlen(str)-1;i>=0;i--)
  {
    if(isdigit(str[i]))
    {
      int n=str[i]-'0',temp=0,len=0;
      i--;
      while(isdigit(str[i]))
        n=n*10+str[i--]-'0',len++;
      while(n>0 || len>=0)
        temp=temp*10+n%10,n/=10,len--;
      stack[++top]=temp;
      i++;
    }
    else if(str[i]==' ')
      continue;
    else
    {
      int a=stack[top--];
      int b=stack[top--];
      switch(str[i])
      {
        case '+':
          stack[++top]=a+b;
          break;
        case '-':
          stack[++top]=a-b;
          break;
        case '*':
          stack[++top]=a*b;
          break;
        case '/':
          stack[++top]=a/b;
          break;
      }
    }
  }
  cout<<stack[top];
}