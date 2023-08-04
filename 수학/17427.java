import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        long answer = 0;

        for(int i = 1; i <= n; i++) {
            int cnt = n / i;
            int val = cnt * i;

            answer += val;
        }

        System.out.println(answer);
    }
}