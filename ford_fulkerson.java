import java.io.*;
import java.util.*;

public class Solution {
    public static long maxFlow(int V, long[][] capacity, int source, int sink) {
        long maxFlow = 0;
        int[] parent = new int[V];
        while (bfs(V, capacity, source, sink, parent)) {
            long pathFlow = Long.MAX_VALUE;
            for (int v = sink; v != source; v = parent[v]) {
                int u = parent[v];
                pathFlow = Math.min(pathFlow, capacity[u][v]);
            }
            for (int v = sink; v != source; v = parent[v]) {
                int u = parent[v];
                capacity[u][v] -= pathFlow;
                capacity[v][u] += pathFlow;
            }
            maxFlow += pathFlow;
        }

        return maxFlow;
    }
    private static boolean bfs(int V, long[][] capacity, int source, int sink, int[] parent) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;
        parent[source] = -1;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v = 0; v < V; v++) {
                // If vertex v is not visited and there is remaining capacity
                if (!visited[v] && capacity[u][v] > 0) {
                    if (v == sink) {
                        parent[v] = u;
                        return true;
                    }
                    queue.add(v);
                    parent[v] = u;
                    visited[v] = true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int V = scan.nextInt();
        int E = scan.nextInt();
        long[][] capacity = new long[V][V];

        for (int i = 0; i < E; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();
            long cap = scan.nextLong();

            capacity[u][v] += cap;
        }
        int source = 0;
        int sink = V - 1;
        System.out.println(maxFlow(V, capacity, source, sink));
    }
}
