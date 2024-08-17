class adjecencyMatrix {
    private int[][] adjacencyMatrix;
    private int numVertices;

    // Constructor
    public adjecencyMatrix(int numVertices) {
        this.numVertices = numVertices;
        adjacencyMatrix = new int[numVertices][numVertices];
    }

    // Add edge
    public void addEdge(int source, int destination) {
        // Adding an edge to the graph (for undirected graph, add both ways)
        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1;
    }

    // Remove edge
    public void removeEdge(int source, int destination) {
        // Removing an edge from the graph
        adjacencyMatrix[source][destination] = 0;
        adjacencyMatrix[destination][source] = 0;
    }

    // Print the adjacency matrix
    public void printGraph() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a graph with 4 vertices
        adjecencyMatrix graph = new adjecencyMatrix(4);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        // Print the adjacency matrix
        graph.printGraph();
    }
}