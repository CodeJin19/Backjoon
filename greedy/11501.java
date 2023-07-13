import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();

        for(int tc = 0; tc < T; tc++) {
            int n = Integer.parseInt(reader.readLine());
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int[] arr = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int val = arr[n - 1];
            long sum = 0;

            for(int i = n - 2; 0 <= i; i--) {
                if(arr[i] < val) {
                    sum += (val - arr[i]);
                } else if(val < arr[i]) {
                    val = arr[i];
                }
            }

            sb.append(sum).append("\n");
        }

        System.out.print(sb.toString());
    }
}