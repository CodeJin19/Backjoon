import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(reader.readLine());

        for(int itr = 0; itr < T; itr++) {
            String line = reader.readLine();
            StringTokenizer st = new StringTokenizer(line);

            int len = st.countTokens();
            String wordList[] = new String[len];
            boolean wordBoolean[] = new boolean[len];

            for(int i = 0; i < len; i++) {
                wordList[i] = st.nextToken();
                wordBoolean[i] = true;
            }

            line = reader.readLine();
            st = new StringTokenizer(line);

            while("what".compareTo(st.nextToken()) != 0) {
                st.nextToken();
                String keyword = st.nextToken();

                for(int i = 0; i < len; i++) {
                    if(!wordBoolean[i])
                        continue;

                    if(keyword.compareTo(wordList[i]) == 0)
                        wordBoolean[i] = false;
                }

                line = reader.readLine();
                st = new StringTokenizer(line);
            }

            for(int i = 0; i < len; i++)
                if(wordBoolean[i])
                    sb.append(wordList[i]).append(" ");
        }

        System.out.println(sb.toString());
    }
}
