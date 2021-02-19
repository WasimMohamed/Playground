#include<iostream>
using namespace std;
class Node
{
  public:
  	int data;
  	Node *next;
}*front=NULL,*rear=NULL;
void append(int val)
{
  Node *newnode = new Node();
  newnode->data = val;
  newnode->next = NULL;
  if(front == NULL)
    front = rear = newnode;
  else
  {
    rear->next = newnode;
    rear = newnode;
  }
}
void display()
{
  Node *temp = front;
  while(temp!=NULL)
  {
    cout<<temp->data<<" ";
    temp = temp->next;
  }
  cout<<endl;
}
void reverse()
{
  Node *prev = NULL;
  Node *curr = front;
  Node *temp;
  while(curr != NULL)
  {
    temp = curr->next;
    curr->next = prev;
    prev = curr;
    curr = temp;
  }
  rear = front;
  front = prev;
}
int main()
{
  int value;
  while(1)
  {
    cin>>value;
    if(value>0)
      append(value);
    else
      break;
  }
  if(front == NULL)
    cout<<"Queue is empty";
  else
  {
  	cout<<"Before reversing:"<<endl;
  	display();
  	reverse();
  	cout<<"After reversing:"<<endl;
  	display();
  }
return 0;
}