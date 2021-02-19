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
 first = NULL;
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
 cin>>pos;
 //cout<<"to be del  "<<pos<<endl;
 
  temp = first;
 int i=1;
 if(first==NULL)
     {
   cout<<"No elements to delete"<<endl;
   
       return 1;
     }
 
  while(temp!=NULL)
   {
     if(pos==1)
     {
       first = first->next;
       return 0;
     }
     else if (i==pos)
     {
       first = temp->next;
       return 0;
     }
     temp = temp->next ;
     i++;
   }
     return 0;

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
 int n, c;
 cin>>n;
 insertion(n);
 display();
 c = deletion(n);

   display();
   
 return 0;
}