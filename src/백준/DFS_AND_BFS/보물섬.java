package 백준.DFS_AND_BFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// 최소거리중에서 가장 큰 값을 찾아야 하므로 bfs로 완전탐색을 돌려야 한다는 생각이 든다.
class Point2{
    int x;
    int y;
    int dis;
    public Point2(int x, int y, int dis){
        this.x = x;
        this.y = y;
        this.dis = dis;
    }
} // end class Point2
public class 보물섬 {
    static int max = Integer.MIN_VALUE;
    static int answer = Integer.MIN_VALUE;
    static int n,m;
    static int[] dx = {-1,0,1,0}; // 행
    static int[] dy = {0,1,0,-1}; // 열
    //static int[][] visited;
    static char[][] board;
    public void bfs(int a, int b){
        Queue<Point2> q = new LinkedList<>();
        int[][] visited = new int[n][m];  // 전역변수 n,m
        q.add(new Point2(a, b,0));
        visited[a][b] = 1; // 방문 표시
        //int cnt = 0;
        while(!q.isEmpty()){
            Point2 tmp = q.poll();
            for(int i=0 ; i<4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<m && visited[nx][ny]==0 && board[nx][ny]=='L'){
                   q.add(new Point2(nx,ny,tmp.dis+1));
                   visited[nx][ny] = 1;
                   max = Math.max(max, tmp.dis+1);
                }
            } // end for

        } // end while
        //return cnt;
    } // end bfs()
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        보물섬 T = new 보물섬();
        n = kb.nextInt(); // 세로(행)
        m = kb.nextInt(); // 가로(열)
        kb.nextLine();
        board = new char[n][m];
        for(int i=0; i<n; i++){
            String s = kb.nextLine();
            for(int j=0; j<m; j++){
                board[i][j] = s.charAt(j);
            }
        } // end for

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j]=='L'){
                    T.bfs(i,j);
                    answer = Math.max(answer, max);
                }
            }
        } // end for
        System.out.println(answer);
    } // end main
}
