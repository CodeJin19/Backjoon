import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int cnt = 0;
        boolean[][] relation = new boolean[n + 1][n + 1];
        boolean[] isFriend = new boolean[n + 1];

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(reader.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            relation[x][y] = true;
            relation[y][x] = true;
        }

        for(int i = 2; i <= n; i++) {
            if(relation[1][i]) {
                isFriend[i] = true;
            } else {
                boolean flag = false;

                for(int j = 1; j <= n; j++) {
                    if(relation[1][j] && relation[j][i]) {
                        flag = true;
                        break;
                    }
                }

                if(flag) {
                    isFriend[i] = true;
                }
            }
        }

        for(int i = 2; i <= n; i++) {
            if(isFriend[i]) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}