package 백준.DFS_AND_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
// BFS()

class Point1{
    int x,y;
    Point1(int x, int y){
        this.x = x;
        this.y = y;
    }
} // end class Point
public class 음식물피하기 {
    static int[] dx = {-1, 0, 1, 0}; // 행
    static int[] dy = {0, 1, 0, -1}; // 열
    static int n, m, k;
    static int[][] board;
    static int[][] visit;
    static int maxCnt = Integer.MIN_VALUE;

    public int solution(int x, int y) { // x는 열 y는 행

        int cnt = 1;
        Queue<Point1> q = new LinkedList<>();
        q.add(new Point1(x, y));
        visit[x][y] = 1; // 큐에 넣고 바로 방문처리 해주기
        while (!q.isEmpty()) {
            Point1 tmp = q.poll();
            //maxCnt++;
            //visit[tmp.x][tmp.y] = 1;
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx > 0 && nx <= n && ny > 0 && ny <= m && visit[nx][ny] == 0 && board[nx][ny] == 1) {
                    q.add(new Point1(nx, ny));
                    cnt++;
                    visit[nx][ny] = 1;
                }
            } // end for
        } // end while
        return cnt;
    } // end solution()

    public static void main(String[] args) throws IOException {
        음식물피하기 T = new 음식물피하기();
        //Scanner kb = new Scanner(System.in);
        //n = kb.nextInt(); // 세로의 길이
        //m = kb.nextInt(); // 가로의 길이
        //k = kb.nextInt(); // 음식물의 개수
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken()); // 세로의 길이
        m = Integer.parseInt(st.nextToken()); // 가로의 길이
        k = Integer.parseInt(st.nextToken()); // 음식물의 개수

        board = new int[n + 1][m + 1];
        visit = new int[n + 1][m + 1];
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            board[a][b] = 1;
        } //end for

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (board[i][j] == 1 && visit[i][j] == 0) {
                    //T.solution(i,j);
                    maxCnt = Math.max(maxCnt, T.solution(i, j));
                    //for (int[] a : visit) Arrays.fill(a, 0);
                }
            }
        } // end for
        System.out.println(maxCnt);
    } // end main
}
