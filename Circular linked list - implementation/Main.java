#include <iostream>
using namespace std;

class Node {
    public:
    int data;
    Node* next;
    Node* prev;
}*head = NULL, *tail = NULL, *temp = NULL;

void append(int x) {
    Node* newNode = new Node;
    newNode->data = x;
    newNode->next = NULL;
    newNode->prev = NULL;

    if(!head) {
        head = newNode;
    }
    else {
        tail->next = newNode;
        newNode->prev = tail;
    }
    tail = newNode;

    head->prev = tail;
    tail->next = head;
}

void display() {
    temp = head;
    do {
        cout << temp->data << endl;
        temp = temp->next;
    }while(temp != head);
}

int main() {
    int value = 1;
    while(value > 0) {
        cin >> value;
        if(value > 0)
            append(value);
    }
    display();
  	//findMax();
    return 0;
}