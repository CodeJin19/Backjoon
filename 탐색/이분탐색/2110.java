import java.io.*;
import java.util.*;

public class Main {
    static int[] list;
    static int c;

    public static boolean batch(int minLen) {
        int idx = 1;
        int beforePos = list[0];
        int cnt = 1;

        while(idx < list.length && cnt < c) {
            if(minLen <= list[idx] - beforePos) {
                beforePos = list[idx];
                cnt++;
            }

            idx++;
        }

        if(cnt == c) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        list = new int[n];

        for(int i = 0; i < n; i++) {
            String pos = reader.readLine();
            list[i] = Integer.parseInt(pos);
        }

        Arrays.sort(list);

        int answer = 0;

        if(c == 2) {
            answer = list[n - 1] - list[0];
        } else {
            int min = 1;
            int max = list[n - 1] - list[0];
            boolean isAble = true;

            while(min <= max) {
                int mid = min + max;
                mid /= 2;

                if(batch(mid)) {
                    answer = Math.max(answer, mid);
                    min = mid + 1;
                } else {
                    max = mid - 1;
                }

                String x = reader.readLine();
            }
        }

        System.out.println(answer);
    }
}