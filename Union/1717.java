import java.io.*;
import java.util.*;

public class Main {
    static int[] arr;

    public static int getHeader(int from) {
        if(arr[from] == from) {
            return from;
        } else {
            arr[from] = getHeader(arr[from]);
            return arr[from];
        }
    }

    public static void join(int a, int b) {
        int aH = getHeader(a);
        int bH = getHeader(b);

        if(aH < bH) {
            arr[bH] = aH;
        } else if(bH < aH) {
            arr[aH] = bH;
        }
    }

    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        arr = new int[n + 1];

        for(int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(reader.readLine());

            int x = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(x == 0) {
                join(a, b);
            } else {
                int aH = getHeader(a);
                int bH = getHeader(b);

                if(aH == bH) {
                    sb.append("YES").append("\n");
                } else {
                    sb.append("NO").append("\n");
                }
            }
        }

        System.out.print(sb);
    }
}