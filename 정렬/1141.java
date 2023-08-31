import java.io.*;
import java.util.*;

public class Main {
    public static int check(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        if(len1 <= len2) {
            boolean flag = true;

            for(int i = 0; i < len1; i++) {
                if(word1.charAt(i) != word2.charAt(i)) {
                    return 0;
                }
            }

            if(flag) {
                return 2;
            }
        } else {
            boolean flag = true;

            for(int i = 0; i < len2; i++) {
                if(word1.charAt(i) != word2.charAt(i)) {
                    return 0;
                }
            }

            if(flag) {
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] list = new String[n];
        boolean[] cache = new boolean[n];

        for(int i = 0; i < n; i++) {
            list[i] = reader.readLine();
        }

        for(int i = 0; i < n; i++) {
            String word1 = list[i];
            boolean flag = true;

            for(int j = 0; j < i; j++) {
                if(!cache[j]) {
                    continue;
                }

                String word2 = list[j];
                int ret = check(word1, word2);

                switch(check(word1, word2)) {
                    case 0:
                        break;
                    case 1:
                        cache[i] = true;
                        cache[j] = false;
                        flag = false;
                        j = i;
                        break;
                    case 2:
                        cache[i] = false;
                        cache[j] = true;
                        flag = false;
                        j = i;
                        break;
                }
            }

            if(flag) {
                cache[i] = true;
            }
        }

        int answer = 0;
        
        for(int i = 0; i < n; i++) {
            if(cache[i]) {
                answer++;
            }
        }
        
        System.out.println(answer);
    }
}