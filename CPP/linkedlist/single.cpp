#include <iostream>

// Node structure for a single linked list
struct Node {
    int data;
    Node* next;
};

// Function to insert a new node at the beginning of the list
Node* insertAtBeginning(Node* head, int value) {
    Node* newNode = new Node;
    newNode->data = value;
    newNode->next = head;
    return newNode;
}

// Function to display the linked list
void display(Node* head) {
    Node* current = head;
    while (current != nullptr) {
        std::cout << current->data << " ";
        current = current->next;
    }
    std::cout << std::endl;
}

int main() {
    // Create an empty linked list
    Node* head = nullptr;

    // Insert elements into the linked list
    head = insertAtBeginning(head, 3);
    head = insertAtBeginning(head, 2);
    head = insertAtBeginning(head, 1);

    // Display the linked list
    std::cout << "Linked list: ";
    display(head);

    // Clean up memory (optional)
    // Perform cleanup by deleting nodes (not shown here to keep the example simple)
    // You can traverse the list and delete each node using 'delete'

    return 0;
}
