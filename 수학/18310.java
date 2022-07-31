import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int[] list = new int[n];

        for (int i = 0; i < n; i++)
            list[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(list);

        if(n % 2 == 0) {
            System.out.println(list[n / 2 - 1]);
        } else {
            System.out.println(list[n / 2]);
        }
    }
}
