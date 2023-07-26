import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int s = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long answer = 1;
        int r = s % k;
        int n = s / k;

        for(int i = 0; i < k; i++) {
            long tmp = n;

            if(0 < r) {
                tmp++;
                r--;
            }

            answer *= tmp;
        }

        System.out.println(answer);
    }
}