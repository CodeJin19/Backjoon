import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int target = Integer.parseInt(reader.readLine());
        int targetX = 0;
        int targetY = 0;
        int fld[][] = new int[n][n];
        final int DOWN = 0;
        final int RIGHT = 1;
        final int UP = 2;
        final int LEFT = 3;
        int num = n * n;
        int y = 0;
        int x = 0;
        int dir = DOWN;
        StringBuilder sb = new StringBuilder();

        while(num != 0) {
            fld[y][x] = num;

            if(num == target) {
                targetY = y + 1;
                targetX = x + 1;
            }

            switch(dir) {
                case DOWN:
                    if(y + 1 < n && fld[y + 1][x] == 0) {
                        y++;
                    } else {
                        dir = RIGHT;
                        x++;
                    }
                    break;
                case UP:
                    if(0 <= y - 1 && fld[y - 1][x] == 0) {
                        y--;
                    } else {
                        dir = LEFT;
                        x--;
                    }
                    break;
                case RIGHT:
                    if(x + 1 < n && fld[y][x + 1] == 0) {
                        x++;
                    } else {
                        dir = UP;
                        y--;
                    }
                    break;
                case LEFT:
                    if(0 <= x - 1 && fld[y][x - 1] == 0) {
                        x--;
                    } else {
                        dir = DOWN;
                        y++;
                    }
                    break;
            }

            num--;
        }

        for(int i = 0; i < n; i++) {
            sb.append(fld[i][0]);

            for(int j = 1; j < n; j++) {
                sb.append(" ");
                sb.append(fld[i][j]);
            }

            sb.append("\n");
        }
        
        sb.append(targetY).append(" ").append(targetX);

        System.out.println(sb.toString()   );
    }
}
