import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        StringBuilder ans = new StringBuilder();
        StringBuilder ansTmp2 = new StringBuilder();

        for(int i = 0; i < n; i++)
            ansTmp2.append("?");

        for(int i = 0; i < h; i++) {
            String tmp = reader.readLine();
            StringBuilder ansTmp1 = new StringBuilder();

            for(int j = 0; j < n; j++) {
                char c = '?';

                for(int k = 0; k < w; k++) {
                    if(tmp.charAt(j * w + k) != '?') {
                        c = tmp.charAt(j * w + k);
                        break;
                    }
                }

                ansTmp1.append(c);
            }

            ans = new StringBuilder();

            for(int j = 0; j < n; j++) {
                if(ansTmp2.charAt(j) != '?')
                    ans.append(ansTmp2.charAt(j));
                else
                  ans.append(ansTmp1.charAt(j));
            }

            ansTmp2 = ans;
        }

        System.out.println(ans.toString());
    }
}
