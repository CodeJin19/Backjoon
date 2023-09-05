import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] height = new int[n];

        StringTokenizer st = new StringTokenizer(reader.readLine());

        for(int i = 0; i < n; i++) {
            height[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;

        for(int s = 0; s < n; s++) {
            double leftD = -Double.MAX_VALUE;
            double rightD = -Double.MAX_VALUE;
            double d;
            int cnt = 0;

            for(int i = s - 1; 0 <= i; i--) {
                d = height[i] - height[s];
                d /= Math.abs(i - s);

                if(leftD < d) {
                    leftD = d;
                    cnt++;
                }
            }

            for(int i = s + 1; i < n; i++) {
                d = height[i] - height[s];
                d /= Math.abs(i - s);

                if(rightD < d) {
                    rightD = d;
                    cnt++;
                }
            }

            answer = answer < cnt ? cnt : answer;
        }

        System.out.println(answer);
    }
}