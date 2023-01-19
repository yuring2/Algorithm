package 백준.DFS_AND_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 전투_2 {
    static int[] dx = {0,1,0,-1}; // 열
    static int[] dy = {-1,0,1,0}; // 행
    static int n; // 가로
    static int m; // 세로
    static int count;
    static char[][] board;
    static boolean[][] visit;
    static int wpower, bpower;
    static void DFS(int x, int y, char color){ // x : j (가로)   y : i (세로)
       visit[y][x] = true;
       count+=1;
       for(int i=0; i<4; i++){
           int ny = y + dy[i];
           int nx = x + dx[i];
           if(ny>=0 && ny<m && nx>=0 && nx<n && board[ny][nx] == color && visit[ny][nx] == false){
               DFS(nx,ny,board[ny][nx]);
           }
       } // end for
    } // end DFS()
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 가로
        m = Integer.parseInt(st.nextToken()); // 세로
        board = new char[m][n];
        visit = new boolean[m][n];
        // board[][] 입력
        for(int i=0; i<m; i++){
            String str = br.readLine();
            for(int j=0; j<n; j++){
                char c = str.charAt(j);
                board[i][j] = c;
            }
        } // end for

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(visit[i][j]==false){
                    count = 0;
                    char color = board[i][j];
                    DFS(j,i,color);

                    if(color == 'W'){
                        wpower+=count*count;
                    }
                    else{
                        bpower += count*count;
                    }
                }
            } // end for
        } // end for
        System.out.println(wpower + " " + bpower);
    } // end main
}
