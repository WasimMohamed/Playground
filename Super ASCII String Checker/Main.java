#include <stdio.h>
int main() {
   char s[30];
   int i,num[30]={0},isascii,n;
   scanf("%d",&n);
   while(n--)
   {
   scanf("%s",s);
   i=0;
   isascii=1;
   while(s[i]!='\0')
   {
       if((s[i]>='a')&&(s[i]<='z'))
       num[s[i]-'a']++;
       s[i]='\0';
       i++;
   }
   for(i=0;i<26;i++)
   {
       if((num[i]>0)&&(num[i]!=(i+1)))
       isascii=0;
       num[i]=0;
   }
   if(isascii)
   printf("YES ");
   else
   printf("NO ");
   }
   return 0;
}