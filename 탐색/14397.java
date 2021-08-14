import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int fld[][] = new int[h][w];
        boolean visit[][] = new boolean[h][w];

        for(int i = 0; i < h; i++) {
            String str = reader.readLine();

            for(int j = 0; j < w; j++) {
                if(str.charAt(j) == '.')
                    fld[i][j] = 1;
                else
                    fld[i][j] = 0;
            }
        }

        int sum = 0;

        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                if(fld[i][j] == 1 && !visit[i][j]) {
                    int cnt = 0;

                    Queue<int[]> queue = new LinkedList<> ();

                    queue.offer(new int[] {i, j});
                    visit[i][j] = true;

                    while(!queue.isEmpty()) {
                        int y = queue.peek()[0];
                        int x = queue.peek()[1];

                        queue.poll();

                        if(0 <= x - 1 && !visit[y][x - 1]) {
                            if(fld[y][x - 1] == 1) {
                                queue.offer(new int[]{y, x - 1});
                                visit[y][x - 1] = true;
                            } else {
                                cnt++;
                            }
                        }

                        if(x + 1 < w && !visit[y][x + 1]) {
                            if(fld[y][x + 1] == 1) {
                                queue.offer(new int[] {y, x + 1});
                                visit[y][x + 1] = true;
                            }else {
                                cnt++;
                            }
                        }

                        if(y % 2 == 0) {
                            if(0 <= x - 1 && 0 <= y - 1 && !visit[y - 1][x - 1]) {
                                if(fld[y - 1][x - 1] == 1) {
                                    queue.offer(new int[] {y - 1, x - 1});
                                    visit[y - 1][x - 1] = true;
                                } else {
                                    cnt++;
                                }
                            }

                            if(0 <= y - 1 && !visit[y - 1][x]) {
                                if(fld[y - 1][x] == 1) {
                                    queue.offer(new int[] {y - 1, x});
                                    visit[y - 1][x] = true;
                                } else {
                                    cnt++;
                                }
                            }

                            if(0 <= x - 1 && y + 1 < h && !visit[y + 1][x - 1]) {
                                if(fld[y + 1][x - 1] == 1) {
                                    queue.offer(new int[] {y + 1, x - 1});
                                    visit[y + 1][x - 1] = true;
                                } else {
                                    cnt++;
                                }
                            }

                            if(y + 1 < h && !visit[y + 1][x]) {
                                if(fld[y + 1][x] == 1) {
                                    queue.offer(new int[] {y + 1, x});
                                    visit[y + 1][x] = true;
                                } else {
                                    cnt++;
                                }
                            }
                        } else {
                            if(0 <= y - 1 && !visit[y - 1][x]) {
                                if(fld[y - 1][x] == 1) {
                                    queue.offer(new int[] {y - 1, x});
                                    visit[y - 1][x] = true;
                                } else {
                                    cnt++;
                                }
                            }

                            if(x + 1 < w && 0 <= y - 1 && !visit[y - 1][x + 1]) {
                                if(fld[y - 1][x + 1] == 1) {
                                    queue.offer(new int[] {y - 1, x + 1});
                                    visit[y - 1][x + 1] = true;
                                } else {
                                    cnt++;
                                }
                            }

                            if(y + 1 < h && !visit[y + 1][x]) {
                                if(fld[y + 1][x] == 1) {
                                    queue.offer(new int[] {y + 1, x});
                                    visit[y + 1][x] = true;
                                } else {
                                    cnt++;
                                }
                            }

                            if(x + 1 < w && y + 1 < h && !visit[y + 1][x + 1]) {
                                if(fld[y + 1][x + 1] == 1) {
                                    queue.offer(new int[] {y + 1, x + 1});
                                    visit[y + 1][x + 1] = true;
                                } else {
                                    cnt++;
                                }
                            }
                        }
                    }

                    sum += cnt;
                }
            }
        }

        System.out.println(sum);
    }
}
