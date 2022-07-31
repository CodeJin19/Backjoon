import java.io.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        boolean fld[][] = new boolean[n][n];
        boolean fld2[][] = new boolean[n][n];

        for(int i = 0; i < n; i++) {
            String line = reader.readLine();

            for(int j = 0; j < n; j++) {
                if(line.charAt(j) == 'Y')
                    fld[i][j] = true;
                else
                    fld[i][j] = false;
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                fld2[i][j] = false;

                if(i == j)
                    continue;

                for(int k = 0; k < n; k++) {
                    if(fld[i][k] && fld[k][j]) {
                        fld2[i][j] = true;
                        break;
                    }
                }
            }
        }

        int max = 0;

        for(int i = 0; i < n; i++) {
            int sum = 0;

            for(int j = 0; j < n; j++) {
                if (fld[i][j] || fld2[i][j]) {
                    sum++;
                }
            }
            max = max < sum ? sum : max;
        }

        System.out.println(max);
    }
}
