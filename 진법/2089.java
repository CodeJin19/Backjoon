import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();

        if(0 <= n && n < 2) {
            sb.append(n);
        } else {
            while(n < 0 || 2 <= n) {
                int x = n / -2;
                int r = n % -2;

                if(r == -1) {
                    r = 1;
                    x++;
                }

                sb.append(r);
                n = x;
            }

            if(n == 1)
                sb.append(1);
        }

        System.out.println(sb.reverse().toString());
    }
}
