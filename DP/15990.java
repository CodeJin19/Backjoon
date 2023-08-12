import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        long[][] arr = new long[100001][4];
        int limit = 4;

        arr[1][1] = 1;
        arr[1][2] = 0;
        arr[1][3] = 0;

        arr[2][1] = 0;
        arr[2][2] = 1;
        arr[2][3] = 0;

        arr[3][1] = 1;
        arr[3][2] = 1;
        arr[3][3] = 1;
        
        for(int i = 4; i <= 100000; i++) {
            arr[i][1] = (arr[i - 1][2] + arr[i - 1][3]) % 1000000009;
            arr[i][2] = (arr[i - 2][1] + arr[i - 2][3]) % 1000000009;
            arr[i][3] = (arr[i - 3][1] + arr[i - 3][2]) % 1000000009;
        }

        for(int tc = 0; tc < T; tc++) {
            int num = Integer.parseInt(reader.readLine());
            long tmp = 0;
            
            tmp = (arr[num][1] + arr[num][2] + arr[num][3]) % 1000000009;
            sb.append(tmp).append("\n");
        }

        System.out.print(sb);
    }
}