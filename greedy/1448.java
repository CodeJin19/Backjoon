import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int list[] = new int[n];

        for(int i = 0; i < n; i++)
            list[i] = Integer.parseInt(reader.readLine());

        Arrays.sort(list);
        int ans = -1;

        for(int i = n - 1; 1 < i; i--) {
            if(list[i] < list[i - 1] + list[i - 2]) {
                ans = list[i] + list[i - 1] + list[i - 2];
                break;
            }
        }

        System.out.println(ans);
    }
}
