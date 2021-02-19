#include <iostream>
using namespace std;
struct Node {
   int data;
   Node* next;
}*newnode, *first, *last, *temp, *temp1;
int main() {
   // Type your code here
 int n;
 cin>>n;
 first=NULL;
 for(int i=0;i<n;i++)
 {
   int pos;
   cin>>pos;
   newnode=new Node();
   cin>>newnode->data;
   if(first==NULL)
   {
     if(pos!=1)
       cout<<"Invalid position\n";
     else
       first=last=newnode;
   }
 
   else
   {
     temp=first;
     int blank=0;
     while(pos>2 &&temp!=NULL)
     {
       temp=temp->next;
       pos--;
     }
     if(temp==NULL)
       cout<<"Invalid position\n";
     else
     {
       if(temp==first && pos==1){
         newnode->next=first;
       first=newnode;}
     else{
       newnode->next=temp->next;
       temp->next=newnode;
     }
     }
   }
 }
 temp=first;
 while(temp!=NULL)
 {
   cout<<temp->data<<"->";
   temp=temp->next;
 }
 cout<<"NULL";
   return 0;
}