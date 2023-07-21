import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static String convert(String word) {
        StringBuilder sb = new StringBuilder();
        boolean[] isUsed = new boolean[26];
        int[] swap = new int[26];
        int len = word.length();

        for(int i = 0; i < 26; i++) {
            swap[i] = 30;
        }

        for(int i = 0; i < len; i++) {
            char c = word.charAt(i);
            int idx = (int)(c - 'a');

            if(swap[idx] == 30) {
                for(int j = 0; j < 26; j++) {
                    if(!isUsed[j]) {
                        c = (char)('a' + j);
                        sb.append(c);

                        swap[idx] = j;
                        isUsed[j] = true;
                        break;
                    }
                }
            } else {
                c = (char)('a' + swap[idx]);
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            String word = reader.readLine();
            String key = convert(word);

            if(map.containsKey(key)) {
                int val = map.get(key);
                map.put(key, val + 1);
            } else {
                map.put(key, 1);
            }
        }

        for(String key : map.keySet()) {
            int cnt = map.get(key);
            cnt = cnt * (cnt - 1);
            cnt /= 2;
            answer += cnt;
        }

        System.out.println(answer);
    }
}