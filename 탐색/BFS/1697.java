import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] cache = new int[100010];

        for(int i = 0; i < 100010; i++) {
            cache[i] = -1;
        }

        cache[n] = 0;

        Queue<Integer> queue = new LinkedList<>();

        queue.add(n);

        while(cache[k] < 0) {
            int pos = queue.poll();

            int newPos = pos - 1;

            if(0 <= newPos && (cache[newPos] < 0 || cache[pos] + 1 < cache[newPos])) {
                cache[newPos] = cache[pos] + 1;

                queue.add(newPos);
            }

            newPos = pos + 1;

            if(newPos <= 100000 && (cache[newPos] < 0 || cache[pos] + 1 < cache[newPos])) {
                cache[newPos] = cache[pos] + 1;

                queue.add(newPos);
            }

            newPos = pos * 2;

            if(newPos <= 100000 && (cache[newPos] < 0 || cache[pos] + 1 < cache[newPos])) {
                cache[newPos] = cache[pos] + 1;

                queue.add(newPos);
            }
        }

        System.out.println(cache[k]);
    }
}