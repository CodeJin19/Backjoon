import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        char[][] fld = new char[r + 1][c + 1];
        int sy = 0;
        int sx = 0;

        for(int i = 1; i <= r; i++) {
            String str = reader.readLine();

            for(int j = 1; j <= c; j++) {
                fld[i][j] = str.charAt(j - 1);

                if(fld[i][j] == 'M') {
                    sy = i;
                    sx = j;
                }
            }
        }

        int[] dy = {1, 0, -1, 0};
        int[] dx = {0, 1, 0, -1};
        int dir = 0;
        int y = 0;
        int x = 0;
        int ny = 0;
        int nx = 0;

        for(int i = 0; i < 4; i++) {
            ny = sy + dy[i];
            nx = sx + dx[i];

            if(ny < 1 || r < ny || nx < 1 || c < nx) {
                continue;
            }

            if(fld[ny][nx] != '.') {
                y = ny;
                x = nx;
                dir = i;
                break;
            }
        }

        while(fld[ny][nx] != '.') {
            y = ny;
            x = nx;

            switch(fld[ny][nx]) {
                case '1':
                    if(dir == 2) {
                        dir = 1;
                    } else if(dir == 3) {
                        dir = 0;
                    }
                    break;
                case '2':
                    if(dir == 0) {
                        dir = 1;
                    } else if(dir == 3) {
                        dir = 2;
                    }
                    break;
                case '3':
                    if(dir == 0) {
                        dir = 3;
                    } else if(dir == 1) {
                        dir = 2;
                    }
                    break;
                case '4':
                    if(dir == 2) {
                        dir = 3;
                    } else if(dir == 1) {
                        dir = 0;
                    }
                    break;
            }

            ny = y + dy[dir];
            nx = x + dx[dir];
        }

        boolean[] pipe = new boolean[4];
        int cnt = 0;
        y = ny;
        x = nx;

        for(int i = 0; i < 4; i++) {
            ny = y + dy[i];
            nx = x + dx[i];

            if(ny < 1 || r < ny || nx < 1 || c < nx) {
                continue;
            }

            switch(i) {
                case 0:
                    if(fld[ny][nx] == '+' || fld[ny][nx] == '|' || fld[ny][nx] == '2' || fld[ny][nx] == '3') {
                        pipe[i] = true;
                        cnt++;
                    }
                    break;
                case 1:
                    if(fld[ny][nx] == '+' || fld[ny][nx] == '-' || fld[ny][nx] == '3' || fld[ny][nx] == '4') {
                        pipe[i] = true;
                        cnt++;
                    }
                    break;
                case 2:
                    if(fld[ny][nx] == '+' || fld[ny][nx] == '|' || fld[ny][nx] == '1' || fld[ny][nx] == '4') {
                        pipe[i] = true;
                        cnt++;
                    }
                    break;
                case 3:
                    if(fld[ny][nx] == '+' || fld[ny][nx] == '-' || fld[ny][nx] == '1' || fld[ny][nx] == '2') {
                        pipe[i] = true;
                        cnt++;
                    }
                    break;
            }
        }

        if(cnt == 4) {
            System.out.println(y + " " + x + " +");
        } else {
            if(pipe[0]) {
                if(pipe[1]) {
                    System.out.println(y + " " + x + " 1");
                } else if(pipe[2]) {
                    System.out.println(y + " " + x + " |");
                } else if(pipe[3]) {
                    System.out.println(y + " " + x + " 4");
                }
            } else if(pipe[1]) {
                if(pipe[2]) {
                    System.out.println(y + " " + x + " 2");
                } else if(pipe[3]) {
                    System.out.println(y + " " + x + " -");
                }
            } else if(pipe[2]) {
                System.out.println(y + " " + x + " 3");
            }
        }
    }
}