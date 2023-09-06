import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            String str = reader.readLine();
            int val = 0;

            if(map.containsKey(str)) {
                val = map.get(str);
            }

            map.put(str, val + 1);
        }

        int k = Integer.parseInt(reader.readLine());

        int[][] list = new int[map.size()][2];
        int idx = 0;

        for(String str : map.keySet()) {
            int len = str.length();
            int zeros = 0;

            for (int i = 0; i < len; i++) {
                if (str.charAt(i) == '0') {
                    zeros++;
                }
            }

            list[idx][0] = map.get(str);
            list[idx][1] = zeros;
            idx++;
        }

        Arrays.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] != o2[0]) {
                    return o2[0] - o1[0];
                } else {
                    return o2[1] - o1[1];
                }
            }
        });

        for(int i = 0; i < list.length; i++) {
            int left = k - list[i][1];
            if(0 <= left && left % 2 == 0) {
                System.out.println(list[i][0]);
                return;
            }
        }

        System.out.println("0");
    }
}