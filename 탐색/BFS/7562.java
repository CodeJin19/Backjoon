import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();

        for(int tc = 0; tc < t; tc++) {
            int l = Integer.parseInt(reader.readLine());

            int[][] cache = new int[l][l];
            int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};
            int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};

            int y, x, ty, tx, moves;

            st = new StringTokenizer(reader.readLine());

            y = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(reader.readLine());

            ty = Integer.parseInt(st.nextToken());
            tx = Integer.parseInt(st.nextToken());

            if(y == ty && x == tx) {
                sb.append(0).append("\n");
                continue;
            }

            Queue<int[]> queue = new LinkedList<>();
            int[] tmp = new int[3];

            tmp[0] = y;
            tmp[1] = x;
            tmp[2] = 0;

            queue.add(tmp);

            while(!queue.isEmpty()) {
                tmp = queue.poll();
                y = tmp[0];
                x = tmp[1];
                moves = tmp[2];

                for(int i = 0; i < 8; i++) {
                    int ny = y + dy[i];
                    int nx = x + dx[i];

                    if(ny < 0 || l <= ny || nx < 0 || l <= nx) {
                        continue;
                    }

                    if(cache[ny][nx] != 0 && cache[ny][nx] <= moves + 1) {
                        continue;
                    }

                    if(y == ny && x == nx) {
                        cache[ny][nx] = moves + 1;

                        while (!queue.isEmpty()) {
                            queue.poll();
                        }

                        break;
                    } else {
                        cache[ny][nx] = moves + 1;

                        tmp = new int[3];
                        tmp[0] = ny;
                        tmp[1] = nx;
                        tmp[2] = moves + 1;

                        queue.add(tmp);
                    }
                }
            }
            
            sb.append(cache[ty][tx]).append("\n");
        }

        System.out.print(sb);
    }
}