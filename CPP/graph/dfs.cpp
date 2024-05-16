#include <iostream>
#include <vector>
#include <list>
#include <stack>

// Function to add an edge to the graph
void addEdge(std::vector<std::list<int>>& graph, int src, int dest) {
    graph[src].push_back(dest);
    graph[dest].push_back(src); // For undirected graph
}

// Function to perform Depth-First Search (DFS) on the graph
void dfs(const std::vector<std::list<int>>& graph, int start) {
    int V = graph.size();
    std::vector<bool> visited(V, false);
    std::stack<int> stack;

    // Push the start vertex onto the stack and mark it as visited
    stack.push(start);
    visited[start] = true;

    while (!stack.empty()) {
        int currentVertex = stack.top();
        stack.pop();
        std::cout << currentVertex << " "; // Visit the current vertex

        // Visit all neighboring vertices of the current vertex
        for (int neighbor : graph[currentVertex]) {
            if (!visited[neighbor]) {
                stack.push(neighbor);
                visited[neighbor] = true;
            }
        }
    }
}

int main() {
    int V = 5; // Number of vertices in the graph
    std::vector<std::list<int>> graph(V);

    // Add edges to the graph
    addEdge(graph, 0, 1);
    addEdge(graph, 0, 2);
    addEdge(graph, 1, 3);
    addEdge(graph, 1, 4);
    addEdge(graph, 2, 4);

    // Perform DFS starting from vertex 0
    std::cout << "DFS traversal starting from vertex 0: ";
    dfs(graph, 0);
    std::cout << std::endl;

    return 0;
}
