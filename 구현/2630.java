import java.io.*;
import java.util.*;

public class Main {
    static int one;
    static int zero;

    public static int check(int[][] fld, int y, int x, int len) {
        boolean flag = true;
        int ret = 0;

        for(int i = y; i < y + len; i++) {
            for(int j = x; j < x + len; j++) {
                if(fld[i][j] != fld[y][x]) {
                    flag = false;
                    i = y + len;
                    j = x + len;
                }
            }
        }

        if(flag) {
            if(fld[y][x] == 0) {
                zero++;
            } else if(fld[y][x] == 1) {
                one++;
            }
        } else {
            ret += check(fld, y, x, len / 2);
            ret += check(fld, y + len / 2, x, len / 2);
            ret += check(fld, y, x + len / 2, len / 2);
            ret += check(fld, y + len / 2, x + len / 2, len / 2);
        }

        return ret;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        zero = 0;
        one = 0;

        int n = Integer.parseInt(reader.readLine());
        int[][] fld = new int[n][n];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(reader.readLine());

            for(int j = 0; j < n; j++) {
                fld[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = check(fld, 0, 0, n);

        System.out.println(zero);
        System.out.println(one);
    }
}
