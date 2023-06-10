import java.io.*;
import java.util.*;

public class Main {
    public static int getGCD(int a, int b) {
        if(a < b) {
            int tmp = b;
            b = a;
            a = tmp;
        }

        int r;
        
        do{
            r = a % b;
            a = b;
            b = r;
        } while(r != 0);

        return a;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int answer = 0;

        st = new StringTokenizer(reader.readLine());

        if(n == 1) {
            answer = Math.abs(Integer.parseInt(st.nextToken()) - s);
        } else {
            int[] list = new int[n];

            for(int i = 0; i < n; i++) {
                list[i] = Integer.parseInt(st.nextToken());
                list[i] = Math.abs(list[i] - s);
            }

            answer = list[0];

            for(int i = 1; i < n; i++) {
                answer = getGCD(answer, list[i]);
            }
        }

        System.out.println(answer);
    }
}
