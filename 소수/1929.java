import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int isPrime[] = new int[N + 1];

        for(int i = 2; i <= N; i++)
            isPrime[i] = 1;

        for(int i = 2; i <= N; i++) {
            if(isPrime[i] == 0)
                continue;

            for(int j = i + i; j <= N;) {
                isPrime[j] = 0;
                j += i;
            }
        }

        for(int i = M; i <= N; i++)
            if(isPrime[i] == 1)
                System.out.println(i);
    }
}
