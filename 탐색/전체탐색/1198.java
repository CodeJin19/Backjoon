import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static double getArea(int[][] dots) {
        double tmp1 = dots[0][1] * dots[1][0] + dots[1][1] * dots[2][0] + dots[2][1] * dots[0][0];
        double tmp2 = dots[1][1] * dots[0][0] + dots[2][1] * dots[1][0] + dots[0][1] * dots[2][0];
        double ret = Math.abs(tmp1 - tmp2);
        ret /= 2;
        return ret;
    }

    public static double getCmb(int[][] dots, boolean[] chck, int sIdx, int cnt) {
        if(dots.length <= sIdx && cnt < 3) {
            return 0;
        }

        if(cnt == 3) {
            int[][] chosenDots = new int[3][2];
            int idx = 0;

            for(int i = 0; i < dots.length; i++) {
                if(chck[i]) {
                    chosenDots[idx][0] = dots[i][0];
                    chosenDots[idx][1] = dots[i][1];
                    idx++;
                }
            }

            return getArea(chosenDots);
        }

        double ret = 0;

        for(int i = sIdx; i < dots.length; i++) {
            chck[i] = true;
            double tmp = getCmb(dots, chck, i + 1, cnt + 1);
            ret = Math.max(ret, tmp);
            chck[i] = false;
        }

        return ret;
    }

    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[][] dots = new int[n][2];
        boolean[] chck = new boolean[n];
        double answer = 0;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(reader.readLine());
            dots[i][0] = Integer.parseInt(st.nextToken());
            dots[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int s = 0; s < n - 2; s++) {
            chck[s] = true;
            double tmp = getCmb(dots, chck, s + 1, 1);
            answer = Math.max(answer, tmp);
            chck[s] = false;
        }

        System.out.println(answer);
    }
}