package 백준.DFS_AND_BFS;

import java.util.Objects;
import java.util.Scanner;
// 틀린코드
public class 전투 {
        // 시계방향
        static int n,m;
        static int[] dx = {-1,0,1,0}; // 행
        static int[] dy = {0,1,0,-1}; // 열
        static int[][] board;
        static int wpower, bpower; // 아군과 적군의 총 전투력
        static int count; // 최대로 연결된 병사 수
        public void findPower(int y, int x, int num ){
          for(int i=0; i<4; i++){
              int nx = x+dx[i];
              int ny = y+dy[i];

              if(nx>=0 && ny>=0 && nx<n && ny < y && board[ny][nx] == num ){
                  board[ny][nx] = 0;
                  count++;
                  findPower(ny,nx,num);
              }
          } // end for
        } // end findPower()
    public static void main(String[] args) {
        전투 T = new 전투();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt(); // 전쟁터의 가로(x)
        m = kb.nextInt(); // 전쟁터의 세로(y)
        board = new int[n][m];
        for(int i=0; i<m; i++){
              char[] c = kb.next().toCharArray();
            for(int j=0; j<n; j++){
              if(Objects.equals(c[j],'W')) board[i][j] = 1;
              else if(Objects.equals(c[j],'B')) board[i][j] = 2;
            }
        } // end for

        // board[i][j] == 1 or 2라면 해당좌표를 방문한 뒤 값을 0으로 변경
        for(int i=0; i<m; i++){
            int result = 0;  // 안쪽 for문이 한번 끝날때마다 초기화
            for(int j=0; j<n; j++){
                count = 1;
                if (board[i][j]==1){
                    board[i][j] = 0;
                    T.findPower(i,j,1); // DFS()
                    result = (int)Math.pow(count,2);
                    wpower+=result;
                }else if(board[i][j]==2){
                    board[i][j] = 0;
                    T.findPower(i,j,2); // DFS()
                    result = (int)Math.pow(count,2);
                    bpower+=result;
                }
            }
        } // end for

        System.out.println(wpower + " " + bpower);
    } // end main
}
