#include <iostream>
using namespace std;
class Node{
  public:
  int data;
  Node* next;
}*head,*tail;
void append(int N)
{
  Node* newnode=new Node;
  newnode->data=N;
  newnode->next=NULL;
  if(!head)
    head=newnode;
  else
    tail->next=newnode;
  tail=newnode;
}
void reverse_list(){
  Node* prev=NULL;
  Node* curr=head;
  Node* temp=curr->next;
  while(curr!=NULL){
    temp=curr->next;
    curr->next=prev;
    prev=curr;
    curr=temp;
  }  
  head=prev;
}
void display(){
  Node* curr=head;
  while(curr!=NULL){
    cout<<curr->data<<" ";
    curr=curr->next;
  }
  cout<<endl;
}
int main() 
{
  int val,N=0;
  while(cin>>val){
    if(val<0)
      break;
    append(val);
    N++;
  }
  if(N==0){
    cout<<"No value has been inserted";
    return 0;
  }
  cout<<"Original Order:\n";
  display();
  reverse_list();
  cout<<"Reverse Order:\n";
  display();
}