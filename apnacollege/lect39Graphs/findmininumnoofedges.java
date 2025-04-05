import java.util.*;

public class findmininumnoofedges {
    private List<List<Integer>> adjList;

    public findmininumnoofedges(int n) {
        adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public int findedges(int start, int end) {
        if (start == end) return 0;

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[adjList.size()];

        queue.add(start);
        visited[start] = true;
        int edges = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            System.out.println("Processing level with " + size + " nodes. Edges so far: " + edges);

            for (int i = 0; i < size; i++) {
                int current = queue.poll();
                System.out.println("Processing node: " + current);

                for (int neighbor : adjList.get(current)) {
                    System.out.println("Checking neighbor: " + neighbor);

                    if (neighbor == end) {
                        System.out.println("Found destination: " + neighbor);
                        return edges+1;
                    }
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.add(neighbor);
                        System.out.println("Added neighbor to queue: " + neighbor);
                    }
                }
            }

            edges++;
        }

        return -1;
    }

    public static void main(String[] args) {
        findmininumnoofedges graph = new findmininumnoofedges(5);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        int start = 0;
        int end = 4;
        int minEdges = graph.findedges(start, end);

        if (minEdges != -1) {
            System.out.println("Minimum number of edges: " + minEdges);
        } else {
            System.out.println("No path exists between " + start + " and " + end);
        }
    }
}
