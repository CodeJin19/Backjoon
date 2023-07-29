import java.io.*;
import java.util.*;

public class Main {
    public static String solve(String[] arr, boolean[] cache, StringBuilder word, int checkIdx) {
        if(checkIdx == 3) {
            char[][] fld = new char[3][3];

            fld[0][0] = word.charAt(0);
            fld[0][1] = word.charAt(1);
            fld[0][2] = word.charAt(2);

            fld[1][0] = word.charAt(3);
            fld[1][1] = word.charAt(4);
            fld[1][2] = word.charAt(5);

            fld[2][0] = word.charAt(6);
            fld[2][1] = word.charAt(7);
            fld[2][2] = word.charAt(8);

            boolean[] check = new boolean[6];

            for(int i = 0; i < 6; i++) {
                check[i] = cache[i];
            }

            for(int j = 0; j < 3; j++) {
                StringBuilder sb = new StringBuilder();

                for(int i = 0; i < 3; i++) {
                    sb.append(fld[i][j]);
                }

                String verWord = sb.toString();

                for(int i = 0; i < 6; i++) {
                    if(!check[i] && arr[i].equals(verWord)) {
                        check[i] = true;
                        break;
                    }
                }
            }

            int cnt = 0;

            for(int i = 0; i < 6; i++) {
                if(check[i]) {
                    cnt++;
                }
            }

            if(cnt == 6) {
                return word.toString();
            } else {
                return "";
            }
        }

        String ret = "";

        for(int i = 0; i < 6; i++) {
            if(cache[i]) {
                continue;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(word.toString());
            sb.append(arr[i]);
            cache[i] = true;

            ret = solve(arr, cache, sb, checkIdx + 1);

            if(0 < ret.length()) {
                return ret;
            }

            cache[i] = false;
        }

        return ret;
    }

    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[6];
        boolean[] cache = new boolean[6];
        StringBuilder sb;
        String answer = "";

        for(int i = 0; i < 6; i++) {
            arr[i] = reader.readLine();
        }

        for(int i = 0; i < 6; i++) {
            sb = new StringBuilder();
            sb.append(arr[i]);
            cache[i] = true;

            answer = solve(arr, cache, sb, 1);

            if(0 < answer.length()) {
                break;
            }

            cache[i] = false;
        }

        if(answer.length() == 0 ){
            System.out.println("0");
        } else {
            sb = new StringBuilder();

            sb.append(answer.charAt(0)).append(answer.charAt(1)).append(answer.charAt(2)).append("\n");
            sb.append(answer.charAt(3)).append(answer.charAt(4)).append(answer.charAt(5)).append("\n");
            sb.append(answer.charAt(6)).append(answer.charAt(7)).append(answer.charAt(8)).append("\n");

            System.out.print(sb.toString());
        }
    }
}