import java.util.*;

class bfs {
    private List<List<Integer>> adjacencyList;
    private int numVertices;

    // Constructor
    public bfs(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new LinkedList<>();

        // Initialize each adjacency list for all vertices
        for (int i = 0; i < numVertices; i++) {
            adjacencyList.add(new LinkedList<>());
        }
    }

    // Add edge
    public void addEdge(int source, int destination) {
        // Adding an edge to the graph (for undirected graph, add both ways)
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    // Perform BFS
    public void bfs(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();

        // Start with the starting vertex
        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            // Dequeue a vertex from the queue and print it
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            // Get all adjacent vertices of the dequeued vertex
            // If an adjacent vertex has not been visited, mark it as visited and enqueue it
            for (int adjVertex : adjacencyList.get(vertex)) {
                if (!visited[adjVertex]) {
                    visited[adjVertex] = true;
                    queue.add(adjVertex);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create a graph with 5 vertices
        bfs graph = new bfs(5);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Perform BFS starting from vertex 0
        System.out.println("Breadth-First Search starting from vertex 0:");
        graph.bfs(0);
    }
}