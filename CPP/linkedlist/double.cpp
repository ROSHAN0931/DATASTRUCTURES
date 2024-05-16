#include <iostream>

// Node structure for a doubly linked list
struct Node {
    int data;
    Node* prev;
    Node* next;
};

// Function to insert a new node at the beginning of the list
Node* insertAtBeginning(Node* head, int value) {
    Node* newNode = new Node;
    newNode->data = value;
    newNode->prev = nullptr;
    newNode->next = head;
    if (head != nullptr) {
        head->prev = newNode;
    }
    return newNode;
}

// Function to display the doubly linked list in forward direction
void displayForward(Node* head) {
    Node* current = head;
    while (current != nullptr) {
        std::cout << current->data << " ";
        current = current->next;
    }
    std::cout << std::endl;
}

// Function to display the doubly linked list in backward direction
void displayBackward(Node* tail) {
    Node* current = tail;
    while (current != nullptr) {
        std::cout << current->data << " ";
        current = current->prev;
    }
    std::cout << std::endl;
}

int main() {
    // Create an empty doubly linked list
    Node* head = nullptr;
    Node* tail = nullptr;

    // Insert elements into the doubly linked list
    head = insertAtBeginning(head, 1);
    tail = head; // Update tail as the first node
    head = insertAtBeginning(head, 2);
    head = insertAtBeginning(head, 3);

    // Display the doubly linked list in forward direction
    std::cout << "Doubly linked list (forward): ";
    displayForward(head);

    // Display the doubly linked list in backward direction
    std::cout << "Doubly linked list (backward): ";
    displayBackward(tail);

    // Clean up memory (optional)
    // Perform cleanup by deleting nodes (not shown here to keep the example simple)
    // You can traverse the list and delete each node using 'delete'

    return 0;
}
