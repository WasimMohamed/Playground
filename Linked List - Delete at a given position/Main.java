#include<iostream>
using namespace std;
struct Node
{ 
	int data; 
	Node* next; 
}*newnode, *first, *last, *temp, *prev, *curn;
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
	}
}
int deletion(int n)
{
	int pos;
	cin>>pos;
  	while(pos>n)
    {
      cout<<"Please enter the correct position\n";
      cin>>pos;
    }
  	if(pos==1)
      first=first->next;
  	else
    {
      curn=first;
      while(pos!=1)
      {
        pos--;
        prev=curn;
        curn=curn->next;
      }
      prev->next=curn->next;
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
  int n;
  cin>>n;
  insertion(n);
  display();
  deletion(n);
  display();
  return 0; 
}
