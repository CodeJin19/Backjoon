import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int len = str.length();
        int s = -1;
        int answer = 0;

        for(int i = 0; i < len; i++) {
            boolean flag = true;

            for(int j = 0; j < len - i; j++) {
                if(str.charAt(i + j) != str.charAt(len - 1 - j)) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                s = i;
                break;
            }
        }

        if(s == -1) {
            answer = len * 2 - 1;
        } else {
            answer = s + len;
        }

        System.out.println(answer);
    }
}