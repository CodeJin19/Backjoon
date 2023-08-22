import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] dy = {1, 0, -1, 0};
        int[] dx = {0, 1, 0, -1};

        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        char[][] fld = new char[n][m];
        boolean[][] isVisited = new boolean[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                fld[i][j] = '.';
            }
        }

        for(int i = 0; i < k; i++) {
            st = new StringTokenizer(reader.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            y--;
            x--;

            fld[y][x] = '*';
        }

        int max = -1;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(isVisited[i][j]) {
                    continue;
                } else if(fld[i][j] == '.') {
                    isVisited[i][j] = true;
                    continue;
                } else {
                    int cnt = 0;

                    int[] tmp = new int[2];
                    tmp[0] = i;
                    tmp[1] = j;

                    Stack<int[]> stack = new Stack<>();
                    stack.push(tmp);
                    isVisited[i][j] = true;

                    while(!stack.isEmpty()) {
                        tmp = stack.pop();
                        int y = tmp[0];
                        int x = tmp[1];
                        cnt++;

                        for(int p = 0; p < 4; p++) {
                            int ny = y + dy[p];
                            int nx = x + dx[p];

                            if(ny < 0 || n <= ny || nx < 0 || m <= nx || isVisited[ny][nx] || fld[ny][nx] == '.') {
                                continue;
                            }

                            tmp = new int[2];
                            tmp[0] = ny;
                            tmp[1] = nx;

                            stack.push(tmp);
                            isVisited[ny][nx] = true;
                        }
                    }

                    max = Math.max(max, cnt);
                }
            }
        }

        System.out.println(max);
    }
}