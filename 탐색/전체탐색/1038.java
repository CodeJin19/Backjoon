import java.io.*;
import java.util.*;

public class Main {
    static HashSet<Long> numbers;

    public static void makeNum(String curNum, int lastDigit) {
        if(lastDigit == 0) {
            Long num = Long.parseLong(curNum);
            numbers.add(num);
            return;
        }

        Long num = Long.parseLong(curNum);
        numbers.add(num);

        StringBuilder sb;

        for(int i = lastDigit - 1; 0 <= i; i--) {
            sb = new StringBuilder(curNum);
            sb.append(i);
            makeNum(sb.toString(), i);
        }

        return;
    }

    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        numbers = new HashSet<>();

        numbers.add(0L);

        for(int i = 1; i < 10; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);

            makeNum(sb.toString(), i);
        }

        Long[] list = new Long[numbers.size()];
        int idx = 0;

        for(Long num : numbers) {
            list[idx++] = num;
        }

        Arrays.sort(list);

        if(list.length <= n) {
            System.out.println(-1);
        } else {
            System.out.println(list[n]);
        }
    }
}