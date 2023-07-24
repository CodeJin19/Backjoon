import java.io.*;
import java.util.*;

public class Main {
    static boolean[][] cache;
    static int maxSongs;
    static int answer;

    public static void solve(boolean[] choosen, int idx) {
        if(idx == choosen.length) {
            boolean[] total = new boolean[cache[0].length];

            for(int i = 0; i < cache.length; i++) {
                for(int j = 0; j < cache[0].length; j++) {
                    if(choosen[i] && cache[i][j]) {
                        total[j] = true;
                    }
                }
            }

            int songCnt = 0;
            int guitarCnt = 0;

            for(int i = 0; i < total.length; i++) {
                if(total[i]) {
                    songCnt++;
                }
            }

            for(int i = 0; i < choosen.length; i++) {
                if(choosen[i]) {
                    guitarCnt++;
                }
            }

            if(maxSongs < songCnt) {
                maxSongs = songCnt;
                answer = guitarCnt;
            } else if(maxSongs == songCnt) {
                if(0 < guitarCnt && guitarCnt < answer) {
                    answer = guitarCnt;
                }
            }
            
            return;
        }

        choosen[idx] = true;
        solve(choosen, idx + 1);

        choosen[idx] = false;
        solve(choosen, idx + 1);

        return;
    }

    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        cache = new boolean[n][m];
        boolean[] choosen = new boolean[n];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(reader.readLine());
            String tmp = st.nextToken();
            tmp = st.nextToken();

            for(int j = 0; j < m; j++) {
                if(tmp.charAt(j) == 'Y') {
                    cache[i][j] = true;
                } else {
                    cache[i][j] = false;
                }
            }
        }

        maxSongs = 0;
        answer = -1;

        choosen[0] = true;
        solve(choosen, 1);

        choosen[0] = false;
        solve(choosen, 1);

        System.out.println(answer);
    }
}