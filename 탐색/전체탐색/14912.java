import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int cnt = 0;

        for(int i = 1; i <= n; i++) {
            int num = i;

            while(num != 0) {
                int r = num % 10;
                num /= 10;

                if(r == d)
                    cnt++;
            }
        }

        System.out.println(cnt);
    }
}
