import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Boolean> isMinus = new ArrayList<Boolean>();
        int len = str.length();
        boolean isNum = false;
        int num = 0;
        int cnt = 0;

        for(int i = 0; i < len; i++) {
            if(isNum) {
                if('0' <= str.charAt(i) && str.charAt(i) <= '9') {
                    num *= 10;
                    num += (int)(str.charAt(i) - '0');
                } else {
                    numbers.add(num);
                    cnt++;
                    isNum = false;

                    if(str.charAt(i) == '+') {
                        isMinus.add(false);
                    } else {
                        isMinus.add(true);
                    }
                }
            } else {
                if('0' <= str.charAt(i) && str.charAt(i) <= '9') {
                    isNum = true;
                    num = (int)(str.charAt(i) - '0');
                }
            }
        }

        numbers.add(num);
        cnt++;

        int answer = numbers.get(0);
        boolean flag = false;

        for(int i = 1; i < cnt; i++) {
            if(flag) {
                answer -= numbers.get(i);
            } else {
                if(isMinus.get(i - 1)) {
                    flag = true;
                    answer -= numbers.get(i);
                } else {
                    answer += numbers.get(i);
                }
            }
        }

        System.out.println(answer);
    }
}