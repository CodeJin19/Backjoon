import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[] bulbs = new boolean[n + 1];
        st = new StringTokenizer(reader.readLine());

        for(int i = 1; i <= n; i++) {
            int state = Integer.parseInt(st.nextToken());

            if(state == 0) {
                bulbs[i] = false;
            } else if(state == 1) {
                bulbs[i] = true;
            }
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int l, r;

            switch(a) {
                case 1:
                    int idx = Integer.parseInt(st.nextToken());
                    int state = Integer.parseInt(st.nextToken());

                    if(state == 0) {
                        bulbs[idx] = false;
                    } else if(state == 1) {
                        bulbs[idx] = true;
                    }
                    break;
                case 2:
                    l = Integer.parseInt(st.nextToken());
                    r = Integer.parseInt(st.nextToken());

                    for(int j = l; j <= r; j++) {
                        bulbs[j] = !bulbs[j];
                    }
                    break;
                case 3:
                    l = Integer.parseInt(st.nextToken());
                    r = Integer.parseInt(st.nextToken());

                    for(int j = l; j <= r; j++) {
                        bulbs[j] = false;
                    }
                    break;
                case 4:
                    l = Integer.parseInt(st.nextToken());
                    r = Integer.parseInt(st.nextToken());

                    for(int j = l; j <= r; j++) {
                        bulbs[j] = true;
                    }
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();

        if(bulbs[1]) {
            sb.append(1);
        } else {
            sb.append(0);
        }

        for(int i = 2; i <= n; i++) {
            if(bulbs[i]) {
                sb.append(" 1");
            } else {
                sb.append(" 0");
            }
        }

        System.out.println(sb);
    }
}