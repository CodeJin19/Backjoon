import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] bridge = new int[n];
        int[] cnt = new int[n];
        boolean[] visited = new boolean[n];

        st = new StringTokenizer(reader.readLine());

        for(int i = 0; i < n; i++) {
            bridge[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(reader.readLine());
        int s = Integer.parseInt(st.nextToken()) - 1;
        int e = Integer.parseInt(st.nextToken()) - 1;

        if(bridge[s] == 1 || s == e) {
            System.out.println(1);
        } else {
            cnt[s] = 0;
            visited[s] = true;
            Queue<Integer> queue = new LinkedList<>();

            queue.offer(s);

            while(!queue.isEmpty()) {
                int idx = queue.poll();
                int jump = bridge[idx];

                if(visited[e] && cnt[e] <= cnt[idx]) {
                    continue;
                }

                for(int i = idx + jump; i < n; i += jump) {
                    if(!visited[i]) {
                        visited[i] = true;
                        cnt[i] = cnt[idx] + 1;
                        queue.offer(i);
                    } else if(cnt[idx] + 1 < cnt[i]) {
                        cnt[i] = cnt[idx] + 1;
                        queue.offer(i);
                    }
                }

                for(int i = idx - jump; 0 <= i; i -= jump) {
                    if(!visited[i]) {
                        visited[i] = true;
                        cnt[i] = cnt[idx] + 1;
                        queue.offer(i);
                    } else if(cnt[idx] + 1 < cnt[i]) {
                        cnt[i] = cnt[idx] + 1;
                        queue.offer(i);
                    }
                }
            }

            if(visited[e]) {
                System.out.println(cnt[e]);
            } else {
                System.out.println(-1);
            }
        }
    }
}
