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
        HashMap<Integer, Integer> borderCnt = new HashMap<>();

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int diff = b - a;

            if(borderCnt.containsKey(diff)) {
                int val = borderCnt.get(diff) + 1;
                borderCnt.put(diff, val);
            } else {
                borderCnt.put(diff, 1);
            }
        }

        int idx = 0;
        int size = borderCnt.size();
        int[] arr = new int[size];

        for(int num : borderCnt.keySet()) {
            arr[idx++] = num;
        }

        Arrays.sort(arr);

        if(arr.length  == 1) {
            System.out.println(1);
        } else {
            int plus = 0;
            int minus = n;
            int before, after;
            int answer = 0;

            for(int i = 0; i < arr.length; i++) {
                before = plus - minus;

                plus += borderCnt.get(arr[i]);
                minus -= borderCnt.get(arr[i]);

                after = plus - minus;

                if(before < 0 && 0 < after) {
                    answer = 1;
                } else if(after == 0) {
                    answer = arr[i + 1] - arr[i] + 1;
                }
            }

            System.out.println(answer);
        }
    }
}