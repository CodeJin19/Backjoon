import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        boolean flag = false;

        for(int i = l; i <= 100; i++) {
            if(0 < 2 * n % i) {
                continue;
            }

            int tmp = 2 * n;
            tmp /= i;
            tmp -= i;
            tmp += 1;

            if(tmp % 2 != 0) {
                continue;
            }

            tmp /= 2;
            int sum = 0;
            int num = tmp;

            if(num < 0) {
                continue;
            }

            while(sum != n) {
                sum += num;
                sb.append(num++).append(" ");
                flag = true;
            }

            if(flag) {
                break;
            }
        }

        if(flag) {
            System.out.println(sb.toString());
        } else {
            System.out.println("-1");
        }
    }
}