#include <iostream>
#include <vector>
#include <queue>
#include <utility> // for std::pair
#include <list>

// Function to add an edge with weight to the weighted graph
void addEdge(std::vector<std::list<std::pair<int, int>>>& graph, int src, int dest, int weight) {
    // Add the destination vertex and weight to the list of source vertex
    graph[src].push_back(std::make_pair(dest, weight));

    // For undirected graph, add the source vertex and weight to the list of destination vertex as well
    // graph[dest].push_back(std::make_pair(src, weight)); // Uncomment this line for undirected graph
}

// Function to perform Breadth-First Search (BFS) on a weighted graph
void bfs(const std::vector<std::list<std::pair<int, int>>>& graph, int start) {
    int V = graph.size();
    std::vector<bool> visited(V, false);
    std::queue<int> q;

    // Enqueue the start vertex and mark it as visited
    q.push(start);
    visited[start] = true;

    while (!q.empty()) {
        int currentVertex = q.front();
        q.pop();
        std::cout << currentVertex << " "; // Visit the current vertex

        // Visit all neighboring vertices of the current vertex
        for (const auto& neighbor : graph[currentVertex]) {
            int neighborVertex = neighbor.first;
            if (!visited[neighborVertex]) {
                q.push(neighborVertex);
                visited[neighborVertex] = true;
            }
        }
    }
}

int main() {
    int V = 4; // Number of vertices in the graph
    std::vector<std::list<std::pair<int, int>>> graph(V);

    // Add edges with weights to the graph
    addEdge(graph, 0, 1, 10);
    addEdge(graph, 0, 2, 6);
    addEdge(graph, 1, 2, 5);
    addEdge(graph, 1, 3, 15);
    addEdge(graph, 2, 3, 4);

    // Perform BFS starting from vertex 0
    std::cout << "BFS traversal starting from vertex 0: ";
    bfs(graph, 0);
    std::cout << std::endl;

    return 0;
}
