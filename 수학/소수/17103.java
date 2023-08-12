import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        boolean[] isPrime = new boolean[1000010];

        StringBuilder sb = new StringBuilder();

        for(int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        for(int i = 2; i < isPrime.length; i++) {
            if(!isPrime[i]) {
                continue;
            }

            for(int j = i + i; j < isPrime.length; j += i) {
                isPrime[j] = false;
            }
        }

        for(int tc = 0; tc < T; tc++) {
            int n = Integer.parseInt(reader.readLine());
            int cnt = 0;

            for(int i = 2; i <= n / 2; i++) {
                if(isPrime[i] && isPrime[n - i]) {
                    cnt++;
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.print(sb);
    }
}
