import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringTokenizer st = new StringTokenizer(reader.readLine());
        HashSet<Integer> hs = new HashSet<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] arr = new int[n];
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;

            if(!hs.contains(num)) {
                hs.add(num);
                cnt++;
            }
        }

        Iterator iter = hs.iterator();
        int[] list = new int[cnt];
        int idx = 0;

        while(iter.hasNext()) {
            list[idx++] = Integer.parseInt(iter.next().toString());
        }

        Arrays.sort(list);

        for(int i = 0; i < list.length; i++) {
            hm.put(list[i], i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(hm.get(arr[0]));

        for(int i = 1; i < arr.length; i++) {
            sb.append(" ").append(hm.get(arr[i]));
        }

        System.out.println(sb);
    }
}