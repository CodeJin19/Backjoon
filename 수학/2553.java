import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        long answer = 1;
        int x;

        for (int i = 1; i <= n; i++) {
            x = i;

            while (x % 10 == 0) {
                x /= 10;
            }

            answer *= x;

            while(answer % 10 == 0) {
                answer /= 10;
            }

            answer %= 1000000;
        }

        answer %= 10;
        System.out.println(answer);
    }
}

/*
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        long answer = 1;
        int x;

        for (int i = 1; i <= n; i++) {
            x = i;

            while (x % 10 == 0) {
                x /= 10;
            }

            while(x % 5 == 0 && answer % 2 == 0) {
                x /= 5;
                answer /= 2;
            }

            answer *= x;

            while(answer % 10 == 0) {
                answer /= 10;
            }

            answer %= 1000000;
        }

        answer %= 10;
        System.out.println(answer);
    }

    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        long answer = 1;
        int x;

        for (int i = 1; i <= n; i++) {
            x = i;

            while (x % 10 == 0) {
                x /= 10;
            }

            while(x % 5 == 0 && answer % 2 == 0) {
                x /= 5;
                answer /= 2;
            }

            answer *= x;

            answer %= 1000000;
        }

        answer %= 10;
        System.out.println(answer);
    }
*/