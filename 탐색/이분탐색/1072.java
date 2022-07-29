import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        long X = Integer.parseInt(st.nextToken());
        long Y = Integer.parseInt(st.nextToken());
        long Z = Y * 100 / X;
        long ans;

        if(99 <= Z) {
            ans = -1;
        } else {
            long max = Integer.MAX_VALUE;
            long min = 1;
            ans = Integer.MAX_VALUE;

            while(min <= max) {
                long mid = (max + min) / 2;
                long tmp = (Y + mid) * 100 / (X + mid);

                if(Z < tmp) {
                    max = mid - 1;
                    ans = mid < ans ? mid : ans;
                } else {
                    min = mid + 1;
                }
            }
        }

        System.out.println(ans);
    }
}
