package 백준.DFS_AND_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
    public int x;
    public int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
} // end class Point

public class 미로탐색 {
    static int n,m;
    static char[][] board;
    static int[] dx = {-1,0,1,0}; // 행
    static int[] dy = {0,1,0,-1}; // 열
    static int[][] distance;
    static int[][] visit;
    public void BFS(int x, int y){
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x, y));
        while(!q.isEmpty()){
            Point tmp = q.poll();
            for(int i=0; i<4; i++){
                int nx = tmp.x + dx[i];  // 행
                int ny = tmp.y + dy[i];  // 열
                // 0보다 크거나 같으면 X , 0보다 커야함(0번 인덱스는 사용 안하기 때문)
                if(nx > 0 && nx <= n && ny> 0 && ny <= m &&  board[nx][ny] == '1' && visit[nx][ny] == 0){
                    q.add(new Point(nx,ny));
                    visit[nx][ny] = 1;
                    distance[nx][ny] = distance[tmp.x][tmp.y] + 1;
                }
            } // end for
        } // end while
    } // end BFS()
    public static void main(String[] args) {
        미로탐색 T = new 미로탐색();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt(); // 행
        m = kb.nextInt(); // 열
        board = new char[n+1][m+1];
        distance = new int[n+1][m+1];
        visit = new int[n+1][m+1];
        for(int i=1; i<=n; i++){
            String str = kb.next();
            for(int j=1; j<=m; j++){
                board[i][j] = str.charAt(j-1); // j-1 주의
            }
        } // end for
        // 1,1이 출발점
        distance[1][1] = 1;
        visit[1][1] = 1;
        T.BFS(1,1);
        System.out.println(distance[n][m]);
    } // end main
}
