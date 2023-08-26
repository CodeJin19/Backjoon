import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());

            for(int j = 0; j < n; j++) {
                pq.add(Integer.parseInt(st.nextToken()));
            }
        }

        int answer = 0;

        for(int i = 0; i < n; i++) {
            answer = pq.poll();
        }

        System.out.println(answer);
    }
}