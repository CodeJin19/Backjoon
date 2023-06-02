import java.io.*;
import java.util.*;

public class Main {
    public static int check(int[] arr, boolean[] chck, int idx, int s) {
        if(arr.length == idx) {
            int sum = 0;
            boolean flag = false;

            for(int i = 0; i < arr.length; i++) {
                if(chck[i]) {
                    sum += arr[i];
                    flag = true;
                }
            }

            if(sum == s && flag) {
                return 1;
            } else {
                return 0;
            }
        }

        int ret = 0;

        chck[idx] = true;
        ret += check(arr, chck, idx + 1, s);

        chck[idx] = false;
        ret += check(arr, chck, idx + 1, s);

        return ret;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int cnt;
        int[] arr = new int[n];
        boolean[] chck = new boolean[n];

        st = new StringTokenizer(reader.readLine());

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            chck[i] = false;
        }

        cnt = check(arr, chck, 0, s);

        System.out.println(cnt);
    }
}
