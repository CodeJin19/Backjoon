import java.io.*;
import java.util.*;

public class Main {
    static int getMax(int startIdx, int cnt, int sum, int list[]) {
        if(cnt == 3)
            return sum % 10;

        int ret = Integer.MIN_VALUE;

        for(int i = startIdx; i < 5; i++) {
            ret = Math.max(ret, getMax(i + 1, cnt + 1, sum + list[i], list));
            ret = Math.max(ret, getMax(i + 1, cnt, sum, list));
        }

        return ret;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int max = Integer.MIN_VALUE;
        int idx = 0;

        for(int itr = 1; itr <= N; itr++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int list[] = new int[5];

            for(int i = 0; i < 5; i++)
                list[i] = Integer.parseInt(st.nextToken());

            int score = getMax(0, 0, 0, list);

            if(max <= score) {
                max = score;
                idx = itr;
            }
        }

        System.out.println(idx);
    }
}
