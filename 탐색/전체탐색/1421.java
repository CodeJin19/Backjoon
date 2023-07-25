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
        int c = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int max = 0;
        long answer = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
            max = Math.max(max, arr[i]);
        }

        for(int i = 1; i <= max; i++) {
            long sum = 0;
            int cnt;
            
            for(int j = 0; j < n; j++) { //- (La / x * c) + (La / x * x * w)
                cnt = arr[j] / i;
                int val;

                if(arr[j] % i == 0) {
                    val = cnt * i * w - (cnt - 1) * c;
                } else {
                    val = cnt * i * w - cnt * c;
                }

                if(0 <= val) {
                    sum += val;
                }
            }
            
            answer = Math.max(answer, sum);
        }

        System.out.println(answer);
    }
}