package 백준.DFS_AND_BFS;

import java.io.*;
import java.util.*;

class Point1_2{
    int x,y;
    Point1_2(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class 음식물피하기_복습 {
    static int[] dx = {-1, 0, 1, 0}; // 행
    static int[] dy = {0, 1, 0, -1}; // 열
    static int n, m, k;
    static int[][] board;
    static int[][] visit;
    static int maxCnt = Integer.MIN_VALUE;

    public int solution(int x, int y) { // x:열 y:행
        int cnt = 1;
        Queue<Point1_2> q = new LinkedList<>();
        q.add(new Point1_2(x, y));
        visit[x][y] = 1;

        while (!q.isEmpty()) {
            Point1_2 tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx > 0 && nx <= n && ny > 0 && ny <= m && visit[nx][ny] == 0 && board[nx][ny] == 1) {
                    q.add(new Point1_2(nx, ny));
                    cnt++;
                    visit[nx][ny] = 1;
                }
            }
        }
        return cnt;
    } // end of solution()

    public static void main(String[] args) throws IOException {
        음식물피하기 T = new 음식물피하기();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        board = new int[n + 1][m + 1];
        visit = new int[n + 1][m + 1];
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            board[a][b] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (board[i][j] == 1 && visit[i][j] == 0) {
                    maxCnt = Math.max(maxCnt, T.solution(i, j));
                }
            }
        } // end for
        System.out.println(maxCnt);
    } // end of main
}
