import java.io.*;
import java.util.*;

public class Main {
    static boolean[] isPrime;

    static ArrayList<Integer> primeList;

    public static boolean checkPrime(int num) {
        if(num == 1) {
            return false;
        }

        int sqrt = (int) Math.sqrt(num);

        for(int i = 1; i <= sqrt; i++) {
            if(isPrime[i] && num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void search(int num, int idx, int n) {
        if(n < idx) {
            primeList.add(num);
            return;
        }

        num *= 10;

        for(int i = 0; i < 10; i++) {
            num += i;
            if(checkPrime(num)) {
                search(num, idx + 1, n);
            }
            num -= i;
        }
    }

    public static void main(String[] args) throws IOException {
        //input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int start = 1;
        int end, len;

        for(int i = 1; i < n; i++) {
            start *= 10;
        }

        end = start * 10;
        len = (int) Math.sqrt(end) + 2;
        isPrime = new boolean[len];

        Arrays.fill(isPrime, true);

        isPrime[1] = false;

        for(int i = 2; i < len; i++) {
            if(!isPrime[i]) {
                continue;
            }

            for(int j = i + i; j < len; j += i) {
                isPrime[j] = false;
            }
        }

        primeList = new ArrayList<>();

        search(2, 2, n);

        search(3, 2, n);

        search(5, 2, n);

        search(7, 2, n);

        for(int number : primeList) {
            System.out.println(number);
        }
    }
}