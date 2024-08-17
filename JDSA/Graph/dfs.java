import java.util.*;

class dfs {
    private List<List<Integer>> adjacencyList;
    private int numVertices;

    // Constructor
    public dfs(int numVertices) {
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

    // Perform DFS
    public void dfs(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        dfsUtil(startVertex, visited);
    }

    // Utility function for DFS (recursive implementation)
    private void dfsUtil(int vertex, boolean[] visited) {
        // Mark the current vertex as visited
        visited[vertex] = true;
        System.out.print(vertex + " ");

        // Recur for all the vertices adjacent to this vertex
        for (int adjVertex : adjacencyList.get(vertex)) {
            if (!visited[adjVertex]) {
                dfsUtil(adjVertex, visited);
            }
        }
    }

    public static void main(String[] args) {
        // Create a graph with 5 vertices
        dfs graph = new dfs(5);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Perform DFS starting from vertex 0
        System.out.println("Depth-First Search starting from vertex 0:");
        graph.dfs(0);
    }
}