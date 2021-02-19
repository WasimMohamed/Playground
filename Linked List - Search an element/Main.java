#include<iostream>
using namespace std;
struct Node
{
int data;
Node* next;
}*newnode, *first, *last, *temp;
int filled = 0;

void insertion(int n)
{
for(int i = 0; i < n; i++){
    newnode = new Node();
    cin>>newnode->data;
if(first == NULL)
{
    first = last = newnode;
}
else
{
    last->next = newnode;
        last=newnode;
}
last->next = NULL;
     filled++;
}
}
int deletion(int n)
{
int pos;
l1:
 cin>>pos;
 if(pos>filled)
 {
   cout<<"Please enter the correct position\n";
 goto l1;}
  temp = first;
 int i=1;
  while(temp!=NULL)
   {
     if(pos==1)
     {
       first = temp->next;
       return 0;
     }
     else if (i==pos-1)
     {
       temp->next = temp->next->next;
       return 0;
     }
     temp = temp->next ;
     i++;
   }

}
void search(int n)
{
   temp = first;
   if(temp==NULL)
   {
       cout<<"Element not found"<<endl;
   }
   else
   {
    while(temp != NULL)
    {
       if(temp->data==n)
           {
             cout<<"Element Found"<<endl;
             return;
           }
       temp=temp->next;
    }
    cout<<"Element not found";
   }
}


void display()
{
   temp = first;
   if(temp==NULL)
   {
       cout<<"No elements to display"<<endl;
   }
   else
   {
    while(temp != NULL)
    {
       cout<<temp->data<<"-->";
       temp=temp->next;
    }
    cout<<"NULL\n";
   }
}

int main() {
 int n, e;
 cin>>n;
 insertion(n);
 //display();
 //deletion(n);
 
 cin>>e;
 display();
 search(e);
 return 0;
}