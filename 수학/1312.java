import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int x = 0;
        int cnt = 0;

        a = a % b;

        while(cnt != n && a != 0) {
            a *= 10;
            x = a / b;
            a %= b;
            cnt++;
        }

        if(cnt != n && a == 0) {
            System.out.println("0");
        } else {
            System.out.println(x);
        }
    }
}