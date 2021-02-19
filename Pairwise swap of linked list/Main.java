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

void swapPairwise() {
    int tempData;
    temp = head;
    while(temp->next) {
        tempData = temp->data;
        temp->data = temp->next->data;
        temp->next->data = tempData;
        if(temp->next->next)
            temp = temp->next->next;
        else
            break;
        
    }
}

int main() {
    int value = 1;
    while(value > 0)
    {
        cin >> value;
        if(value > 0)
            append(value);
    }
    swapPairwise();
    display();
    return 0;
}