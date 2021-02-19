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

int main() {
    int value = 1;
    while(value > 0) {
        cin >> value;
        if(value > 0)
            append(value);
    }
  	deleteHead();
    display();
    return 0;
}