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

    //head->prev = tail;
    //tail->next = head;
}

void display() {
    temp = head;
    if(temp) {
        do {
            cout << temp->data << endl;
            temp = temp->next;
        }while(temp && temp != head);
    }
}

void displayReverse() {
    temp = tail;
    if(temp) {
        do {
            cout << temp->data << endl;
            temp = temp->prev;
        } while (temp && temp != tail);
    }
}

int search(int x) {
    temp = head;
    if(temp) {
        do {
            if(temp->data == x)
                return 1;
            temp = temp->next;
        }while(temp && temp != head);
    }
    return 0;
}

int main() {
    int value = 1;
  	cout << "Linked list before removal of duplicates\n";
    while(value > 0) {
        cin >> value;
        if(value > 0 && !search(value)) {
            append(value);
        }
      	if(value > 0)
          	cout << value << endl;
    }
  	cout << "Linked list after removal of duplicates\n";
    display();
  	//findMax();
    return 0;
}