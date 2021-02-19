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

void deleteHead() {
    if(head) {
        Node* temp = head;
        head = head->next;
        delete temp;
    }
}

void display() {
    Node* temp = head;
    while (temp){
        cout << temp->data << endl;
        temp = temp->next;
    }
    
}

void nthNode(int n) {
    Node* temp = head;
    int data = -1;
    while(n > 0 && temp) {
        data = temp->data;
        temp = temp->next;
    }
    if(data != -1) {
        cout << data;
    }
    else {
        cout << "There is no nth node in the list";
    }
}

void search(int x) {
    Node* temp = head;
    while(temp) {
        if(temp->data == x) {
            cout << x << " is present in the list";
            return;
        }
        temp = temp->next;
    }
}

void findMax() {
	Node* temp = head;
  	int max = 0; 
  	while(temp) {
    	if(temp->data > max) {
        	max = temp->data;
        }
      	temp = temp->next;
    }
      	cout << max;
}

int main() {
    int value = 1;
    while(value > 0) {
        cin >> value;
        if(value > 0)
            append(value);
    }
  	findMax();
    return 0;
}