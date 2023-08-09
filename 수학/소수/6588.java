import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        StringBuilder sb = new StringBuilder();
        boolean[] isPrime = new boolean[1000010];

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

        while(n != 0) {
            boolean flag = false;
            for(int i = 1; i <= n / 2; i += 2) {
                if(isPrime[i] && isPrime[n - i]) {
                    sb.append(n).append(" = ").append(i).append(" + ").append((n - i)).append("\n");
                    flag = true;
                    break;
                }
            }

            if(!flag) {
                sb.append("Goldbach's conjecture is wrong.").append("\n");
            }

            n = Integer.parseInt(reader.readLine());
        }

        System.out.print(sb);
    }
}