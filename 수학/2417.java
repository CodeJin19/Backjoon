import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(reader.readLine());
        double tmp = Math.sqrt(num);
        long ans = (long) tmp;

        if(ans * ans < num)
            System.out.println(ans + 1);
        else
            System.out.println(ans);
    }
}
