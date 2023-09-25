import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] fld = new int[n][m];

        for(int i = 0; i < n; i++) {
            String str = reader.readLine();

            for(int j = 0; j < m; j++) {
                if(str.charAt(j) == '0') {
                    fld[i][j] = 0;
                } else {
                    fld[i][j] = 1;
                }
            }
        }

        int[] dy = {1, 0, -1, 0};
        int[] dx = {0, 1, 0, -1};
        int[][][] cache = new int[n][m][2];

        cache[n - 1][m - 1][0] = Integer.MAX_VALUE;
        cache[n - 1][m - 1][1] = Integer.MAX_VALUE;
        cache[0][0][1] = 1;

        Queue<int[]> queue = new LinkedList<>();

        int[] tmp = new int[3];
        int y = 0;
        int x = 0;
        int z = 1;

        tmp[0] = y;
        tmp[1] = x;
        tmp[2] = z;

        queue.add(tmp);

        while(!queue.isEmpty()) {
            tmp = queue.poll();
            y = tmp[0];
            x = tmp[1];
            z = tmp[2];

            for(int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];
                int nz = z;

                if(ny < 0 || n <= ny || nx < 0 || m <= nx) {
                    continue;
                }

                //fld[ny][nx] == 0 && (cache[ny][nx][nz] == 0 || cache[y][x][z] + 1 < cache[ny][nx][nz])
                if(fld[ny][nx] == 1 || (cache[ny][nx][nz] != 0 && cache[ny][nx][nz] <= cache[y][x][z] + 1)) {
                    continue;
                }

                cache[ny][nx][nz] = cache[y][x][z] + 1;

                tmp = new int[3];
                tmp[0] = ny;
                tmp[1] = nx;
                tmp[2] = nz;

                queue.add(tmp);
            }

            if(z == 1) {
                for(int i = 0; i < 4; i++) {
                    int ny = y + dy[i];
                    int nx = x + dx[i];
                    int nz = z - 1;

                    if(ny < 0 || n <= ny || nx < 0 || m <= nx) {
                        continue;
                    }

                    //fld[ny][nx] == 1 && (cache[ny][nx][nz] == 0 || cache[y][x][z] + 1 < cache[ny][nx][nz])
                    if(fld[ny][nx] == 0 || (cache[ny][nx][nz] != 0 && cache[ny][nx][nz] <= cache[y][x][z] + 1)) {
                        continue;
                    }

                    cache[ny][nx][nz] = cache[y][x][z] + 1;

                    tmp = new int[3];
                    tmp[0] = ny;
                    tmp[1] = nx;
                    tmp[2] = nz;

                    queue.add(tmp);
                }
            }

            if(cache[n - 1][m - 1][0] < Integer.MAX_VALUE || cache[n - 1][m - 1][1] < Integer.MAX_VALUE) {
                break;
            }
        }

        if(cache[n - 1][m - 1][0] < Integer.MAX_VALUE) {
            System.out.println(cache[n - 1][m - 1][0]);
        } else if(cache[n - 1][m - 1][1] < Integer.MAX_VALUE) {
            System.out.println(cache[n - 1][m - 1][1]);
        } else {
            System.out.println(-1);
        }
    }
}