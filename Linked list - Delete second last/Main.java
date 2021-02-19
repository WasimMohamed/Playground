#include <iostream>
using namespace std;
class Node{
  public:
  int data;
  Node* next;
}*head,*tail;
void append(int N){
  Node *newnode=new Node;
  newnode->data=N;
  newnode->next=NULL;
  if(!head)
    head=newnode;
  else
    tail->next=newnode;
  tail=newnode;
}
void display(){
  Node *temp=head;
  while(temp!=NULL){
    cout<<temp->data<<" ";
    temp=temp->next;
  }
  cout<<endl;
}
void del_sec_last(){
  if(head->next->next==NULL){
    head=head->next;
    display();
    return;
  }  
  Node *curr=head;
  Node *prev=head;
  while(curr->next->next!=NULL){
    prev=curr;
    curr=curr->next;
  }
  prev->next=curr->next;
  display();
}
int main() 
{
  int N=0,val;
  while(cin>>val){
    if(val<0)
      break;
    append(val);
    N++;
  }
  if(N==0){
    cout<<"Deletion of second last element is not possible";
    return 0;
  }
  if(N==1){
    cout<<"Before deleting:\n";
    display();
    cout<<"Deletion of second last element is not possible";
    return 0;
  }
  cout<<"Before deleting:\n";
  display();
  cout<<"After deleting:\n";
  del_sec_last();
}