import java.util.LinkedList;
import java.util.List;

class adjacencyList {
    private List<List<Integer>> adjacencyList;
    private int numVertices;

    // Constructor
    public adjacencyList(int numVertices) {
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

    // Print the adjacency list
    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ": ");
            for (Integer vertex : adjacencyList.get(i)) {
                System.out.print(vertex + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a graph with 4 vertices
        adjacencyList graph = new adjacencyList(4);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        // Print the adjacency list
        graph.printGraph();
    }
}