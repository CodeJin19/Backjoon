import java.io.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        final int UP = 1;
        final int LEFT = 2;
        final int DOWN = 3;
        final int RIGHT = 4;
        StringBuilder sb = new StringBuilder();

        for(int itr = 0; itr < n; itr++) {
            String move = reader.readLine();
            int len = move.length();
            int dir = UP;

            int minX = 0;
            int maxX = 0;
            int minY = 0;
            int maxY = 0;

            int x = 0;
            int y = 0;

            for(int i = 0; i < len; i++) {
                switch(move.charAt(i)){
                    case 'F':
                        switch(dir) {
                            case UP:
                                y++;
                                break;
                            case DOWN:
                                y--;
                                break;
                            case LEFT:
                                x--;
                                break;
                            case RIGHT:
                                x++;
                                break;
                        }
                        break;
                    case 'B':
                        switch(dir) {
                            case UP:
                                y--;
                                break;
                            case DOWN:
                                y++;
                                break;
                            case LEFT:
                                x++;
                                break;
                            case RIGHT:
                                x--;
                                break;
                        }
                        break;
                    case 'L':
                        switch(dir) {
                            case UP:
                                dir = LEFT;
                                break;
                            case DOWN:
                                dir = RIGHT;
                                break;
                            case LEFT:
                                dir = DOWN;
                                break;
                            case RIGHT:
                                dir = UP;
                                break;
                        }
                        break;
                    case 'R':
                        switch(dir) {
                            case UP:
                                dir = RIGHT;
                                break;
                            case DOWN:
                                dir = LEFT;
                                break;
                            case LEFT:
                                dir = UP;
                                break;
                            case RIGHT:
                                dir = DOWN;
                                break;
                        }
                        break;
                }

                minX = x < minX ? x : minX;
                maxX = maxX < x ? x : maxX;
                minY = y < minY ? y : minY;
                maxY = maxY < y ? y : maxY;
            }

            int area = Math.abs(maxX - minX) * Math.abs(maxY - minY);
            sb.append(area).append("\n");
        }

        System.out.print(sb.toString());
    }
}
