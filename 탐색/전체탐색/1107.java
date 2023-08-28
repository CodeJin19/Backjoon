import java.io.*;
import java.util.*;

public class Main {
    static boolean[] isBroken;

    public static boolean isAble(int targetNum) {
        if(targetNum == 0) {
            if(isBroken[0]) {
                return false;
            } else {
                return true;
            }
        }

        while(targetNum != 0) {
            int digit = targetNum % 10;

            if(isBroken[digit]) {
                return false;
            }

            targetNum /= 10;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        isBroken = new boolean[11];

        if(0 < m) {
            StringTokenizer st = new StringTokenizer(reader.readLine());

            for(int i = 0; i < m; i++) {
                int num = Integer.parseInt(st.nextToken());
                isBroken[num] = true;
            }
        }

        int answer = Math.abs(n - 100);

        if(m < 10) {
            int num = n;

            while(!isAble(num) && num < 4444445) {
                num++;
            }

            if(num < 4444445) {
                int numDup = num;
                int cnt = 0;

                if(numDup == 0) {
                    cnt = 1;
                } else {
                    cnt = 0;
                }

                while(numDup != 0) {
                    cnt++;
                    numDup /= 10;
                }

                answer = Math.min(answer, cnt + num - n);
            }

            num = n;

            while(0 <= num && !isAble(num)) {
                num--;
            }

            if(0 <= num) {
                int numDup = num;
                int cnt = 0;

                if(numDup == 0) {
                    cnt = 1;
                } else {
                    cnt = 0;
                }

                while(numDup != 0) {
                    cnt++;
                    numDup /= 10;
                }

                answer = Math.min(answer, cnt + n - num);
            }
        }

        System.out.println(answer);
    }
}