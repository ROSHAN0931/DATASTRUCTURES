#include <iostream>
#include <queue>

int main() {
    // Creating a priority queue of integers
    std::priority_queue<int> pq;

    // Inserting elements into the priority queue
    pq.push(10);
    pq.push(30);
    pq.push(20);

    // Accessing the top element (highest priority element)
    std::cout << "Top element: " << pq.top() << std::endl;

    // Removing the top element
    pq.pop();

    // Accessing the top element after removal
    std::cout << "Top element after pop: " << pq.top() << std::endl;

    // Size of the priority queue
    std::cout << "Size of priority queue: " << pq.size() << std::endl;

    // Checking if the priority queue is empty
    std::cout << "Is priority queue empty? " << (pq.empty() ? "Yes" : "No") << std::endl;

    return 0;
}
