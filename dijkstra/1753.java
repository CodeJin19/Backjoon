import java.io.*;
import java.util.*;

public class Main {
    static class Edge {
        public int from;
        public int to;
        public int weight;

        Edge(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        int k = Integer.parseInt(reader.readLine());

        ArrayList<Edge>[] edges = new ArrayList[v + 1];

        for(int i = 1; i <= v; i++) {
            edges[i] = new ArrayList<>();
        }

        for(int i = 0; i < e; i++) {
            st = new StringTokenizer(reader.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            Edge newEdge = new Edge(from, to, w);
            edges[from].add(newEdge);
        }

        int[] minLen = new int[v + 1];
        int[] status = new int[v + 1];
        int current;

        Arrays.fill(minLen, Integer.MAX_VALUE);
        current = k;
        minLen[current] = 0;
        status[current] = 1;

        while(current != 0) {
            int len = edges[current].size();

            for(int i = 0; i < len; i++) {
                Edge edge = edges[current].get(i);
                int to = edge.to;
                int weight = edge.weight;

                if(minLen[to] == Integer.MAX_VALUE) {
                    minLen[to] = minLen[current] + weight;
                    status[to] = 1;
                } else {
                    minLen[to] = Math.min(minLen[to], minLen[current] + weight);
                }
            }

            status[current] = 2;
            int val = Integer.MAX_VALUE;
            int next = 0;

            for(int i = 1; i <= v; i++) {
                if(status[i] == 1 && minLen[i] < val) {
                    val = minLen[i];
                    next = i;
                }
            }

            current = next;
        }

        StringBuilder sb = new StringBuilder();

        if(minLen[1] == Integer.MAX_VALUE) {
            sb.append("INF");
        } else {
            sb.append(minLen[1]);
        }

        for(int i = 2; i <= v; i++) {
            if(minLen[i] == Integer.MAX_VALUE) {
                sb.append("\n").append("INF");
            } else {
                sb.append("\n").append(minLen[i]);
            }
        }

        System.out.println(sb);
    }
}