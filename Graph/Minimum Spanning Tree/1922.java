import java.io.*;
import java.util.*;

public class Main {
    static class Edge implements Comparable<Edge>{
        public int node1;
        public int node2;
        public int cost;

        Edge(int a, int b, int cost) {
            node1 = a;
            node2 = b;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            if(o.cost < this.cost) {
                return 1;
            } else {
                return -1;
            }
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("cost : ").append(this.cost).append(" : ").append(this.node1).append(" <-> ").append(this.node2);
            return sb.toString();
        }
    }

    static int[] set;

    public static int getHeader(int fromNode) {
        if(set[fromNode] == fromNode) {
            return fromNode;
        } else {
            set[fromNode] = getHeader(set[fromNode]);
            return set[fromNode];
        }
    }

    public static void union(int node1, int node2) {
        int node1Header = getHeader(node1);
        int node2Header = getHeader(node2);

        if(node1Header <= node2Header) {
            set[node2Header] = node1Header;
        } else {
            set[node1Header] = node2Header;
        }
    }

    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        set = new int[n + 1];
        Edge[] list = new Edge[m];

        for(int i = 1; i <= n; i++) {
            set[i] = i;
        }

        for(int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            list[i] = new Edge(a, b, c);
        }

        Arrays.sort(list);

        int totalCost = 0;

        for(int i = 0; i < m; i++) {
            int node1 = list[i].node1;
            int node2 = list[i].node2;

            int header1 = getHeader(node1);
            int header2 = getHeader(node2);

            if(header1 != header2) {
                union(node1, node2);
                totalCost += list[i].cost;
            }
        }

        System.out.println(totalCost);
    }
}