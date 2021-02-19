#include <iostream>
using namespace std; 
int stack[100], n=100, top=-1;
void push(int val) {
   if(top>=n-1)
      cout<<"Stack is Full!!! Insertion is not possible!!!"<<"\n"; 
   else {
      top++;
      stack[top]=val;
   }
}
void pop() {
   if(top<=-1)
      cout<<"Stack is Empty!!! Deletion is not possible!!!"<<endl;
   else {
      top--;
   }
}
void display() {
   if(top>=0) {
      for(int i=top; i>=0; i--)
         cout<<stack[i]<<"\n";
   } else
      cout<<"Stack is Empty";
}
int main() {
   int ch, val; 
   do {
      cin>>ch;
      switch(ch) {
         case 1: {   
            cin>>val;
            push(val);
            break;
         }
         case 2: {
            pop();
            break;
         }
         case 3: {
            display();
            break;
         }
         case 4: {
            break;
         }
         default: {
            cout<<"Wrong selection!!! Try again!!!"<<"\n";
         }
      }
   }while(ch!=4); 
      return 0;
}