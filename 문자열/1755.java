import java.io.*;
import java.util.*;

public class Main {
    public static String swap(int num) {
        switch(num) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int from = Integer.parseInt(st.nextToken());
        int to = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = new String[to - from + 1];
        int idx = 0;

        for(int i = from; i <= to; i++) {
            StringBuilder tmp = new StringBuilder();

            if(i < 10) {
                tmp.append(swap(i));
            } else {
                int ten = i / 10;
                int one = i % 10;

                tmp.append(swap(ten)).append(" ").append(swap(one));
            }

            map.put(tmp.toString(), i);
            arr[idx++] = tmp.toString();
        }

        Arrays.sort(arr);
        StringBuilder answer = new StringBuilder();
        boolean s = true;

        for(int i = 0; i < arr.length; i++) {
            if(s) {
                answer.append(map.get(arr[i]));
                s = false;
            } else {
                answer.append(" ").append(map.get(arr[i]));
            }

            if(i % 10 == 9) {
                answer.append("\n");
                s = true;
            }
        }

        System.out.print(answer);
    }
}