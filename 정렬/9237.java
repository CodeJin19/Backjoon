import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int list[] = new int[n];

        StringTokenizer st = new StringTokenizer(reader.readLine());

        for(int i = 0; i < n; i++)
            list[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(list);

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++)
            max = Math.max(max, list[n - 1 - i] + 2 + i);

        System.out.println(max);
    }
}
