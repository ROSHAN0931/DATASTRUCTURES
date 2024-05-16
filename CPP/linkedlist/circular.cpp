#include <iostream>

// Node structure for a circular linked list
struct Node {
    int data;
    Node* next;
};

// Function to insert a new node at the beginning of the circular linked list
Node* insertAtBeginning(Node* head, int value) {
    Node* newNode = new Node;
    newNode->data = value;
    if (head == nullptr) {
        newNode->next = newNode; // Point to itself for the first node
    } else {
        newNode->next = head->next;
        head->next = newNode;
    }
    return newNode;
}

// Function to display the circular linked list
void display(Node* head) {
    if (head == nullptr) {
        std::cout << "Circular linked list is empty." << std::endl;
        return;
    }
    Node* current = head->next;
    do {
        std::cout << current->data << " ";
        current = current->next;
    } while (current != head->next); // Loop until we reach the starting point
    std::cout << std::endl;
}

int main() {
    // Create an empty circular linked list
    Node* head = nullptr;

    // Insert elements into the circular linked list
    head = insertAtBeginning(head, 1);
    head = insertAtBeginning(head, 2);
    head = insertAtBeginning(head, 3);

    // Display the circular linked list
    std::cout << "Circular linked list: ";
    display(head);


    return 0;
}
