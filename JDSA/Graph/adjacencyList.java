class Node {
    int vertex;
    Node next;

    Node(int vertex) {
        this.vertex = vertex;
        this.next = null;
    }
}

class Graph {
    private int vertices;
    private Node[] adjList; 

    // Constructor
    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new Node[vertices];

        for (int i = 0; i < vertices; i++) {
            adjList[i] = null;
        }
    }

    public void addEdge(int u, int v) {
        Node node1 = new Node(v);
        node1.next = adjList[u];
        adjList[u] = node1;

        Node node2 = new Node(u);
        node2.next = adjList[v];
        adjList[v] = node2;
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + ": ");
            Node temp = adjList[i];
            while (temp != null) {
                System.out.print(temp.vertex + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(5);  

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.printGraph();
    }
}

