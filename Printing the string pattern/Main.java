#include<stdio.h>
int main() {
 char s[100],a[100];
 scanf("%s",&s);
 int len,mid,k=0;
 len=strlen(s);
 mid=len/2;
 for(int i=mid;i<strlen(s);i++)
   a[k++]=s[i];
 for(int i=0;i<mid;i++)
   a[k++]=s[i];
 
 for(int i=0;i<strlen(s);i++){
   k=0;
   for(int j=0;j<strlen(s);j++){
     if(j<len-1)
       printf(" ");
     if(j>=len-1)
       printf("%c",a[k++]);
   }
   len--;
   printf("\n");
 }
 return 0;
}