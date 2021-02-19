#include <iostream>
using namespace std;
class Node {
    public:
    int data;
    Node* next;
} *head = NULL, *tail = NULL;
void append(int x) {
    Node* newNode = new Node;
    newNode->data = x;
    newNode->next = NULL;
    if(!head) {
        head = newNode;
    }
    else {
        tail->next = newNode;
    }
    tail = newNode;
}
void display() {
    Node* temp = head;
    while (temp){
        cout << temp->data << endl;
        temp = temp->next;
    }
}
void delnthNode(int N, int K) {
  Node* curr=head;
  while(N>K){
    curr=curr->next;
    N--;
  }
  cout<<curr->data<<" is the nth node element in the list";
  

}
int main() {
  int N=0,val;
  while(cin>>val){
    if(val<0)
      break;
    append(val);
    N++;
  }
  int K;
  cout<<"Enter the nth node:\n";
  cin>>K;
  if(K>N)
    cout<<"There is no nth node in the list";
  else
    delnthNode(N,K);
}