#include<iostream>
using namespace std;
struct Node
{ 
	int data; 
	Node* next; 
}*newnode, *first, *last, *temp, *prev, *curn;
int main() { 
  int x,n,arr[10];
  cin>>n;
  cout<<"Before deletion:\n";
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
    cout<<arr[i]<<"-->";
  }
  cout<<"NULL\n";
  cin>>x;
  cout<<"After deletion:\n";
  for(int i=0;i<n;i++)
    if(arr[i]!=x)
      cout<<arr[i]<<"-->";
  cout<<"NULL";  
}