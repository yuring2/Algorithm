package 백준;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 빙산_복습 {
    private static Scanner sc = new Scanner(System.in);
    private static int n; // 행
    private static int m; // 열
    private static int[] dx = {-1,0,1,0};
    private static int[] dy = {0,1,0,-1};
    private static boolean[][] visited;
    private static int[][] map;
    private static int answer = 0;

    public static void main(String[] args) {

        // 1. 사용자 입력받기
        inputData();
        // 2. 빙산 조각세기, 빙산 녹이기
        startLoop();
        // 3. 정답 출력
        printAnswer();
    } // end of main

    private static void printAnswer() {
        System.out.println(answer);
    }


    private static void startLoop() {
        while (true) {
            int result = countIce(); // 빙산 조각 세기
            if(result==0){
                answer = 0;
                return;
            }
            if(result >=2) return;

            // 1조각인 경우
            bfsOfMeltingIce();
            answer++;
        }
    } // end of startLoop()


    private static void bfsOfMeltingIce() {
        visited = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) {
                if (map[i][j] != 0) {
                    q.add(new int[]{i,j});
                    visited[i][j] = true; //빙산이 녹아서 0이 된건데 동서남북 탐색을 할 때 바다로 인식하기 때문
                }
            }
        }

        while(!q.isEmpty()){
            int[] curr = q.poll();
            int k=0;
            for(int i=0 ; i<4; i++){
                int nx = curr[0] + dx[i];
                int ny = curr[1] + dy[i];

                if(nx>=0 && nx<n && ny>=0 && ny<m && visited[nx][ny]== false && map[nx][ny]==0){
                    k++;
                }
            }

            if(map[curr[0]][curr[1]]-k <= 0 ){
                map[curr[0]][curr[1]] = 0;
            }else{
                map[curr[0]][curr[1]]-=k;
            }
        }
    } // end of bfsOfMelingIce()


    private static int countIce() { // 빙산 조각 세기 메서드
        visited = new boolean[n][m];
        int icecnt=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(visited[i][j]==false && map[i][j]>0){
                    dfsOfCountIce(i,j);
                    icecnt++;
                }
            }
        }
        return icecnt;
    } // end of countIce()


    private static void dfsOfCountIce(int x, int y) {
        visited[x][y] = true;

        for(int i=0; i<4; i++){

            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx>=0 && nx<n && ny>=0 && ny<m && visited[nx][ny]==false && map[nx][ny]!=0){
                dfsOfCountIce(nx,ny);
            }
        }
    } // end of dfsOfCountIce()


    private static void inputData() {
        n = sc.nextInt();
        m = sc.nextInt();
        visited = new boolean[n][m];
        map = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                map[i][j] = sc.nextInt();
            }
        }
    } // end of inputData()
}
