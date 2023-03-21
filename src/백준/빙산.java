package 백준;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 빙산 {
    static final Scanner sc = new Scanner(System.in);
    static int n,m;
    static int[][] map;
    static boolean[][] visit;
    static int answer = 0;
    // 시계방향
    static int[] dx = {-1,0,1,0}; // 행
    static int[] dy = {0,1,0,-1}; // 열
    public static void main(String[] args) {
       // 1. 데이터 세팅
       inputData();
       // 2. 빙산 조각 세기, 빙산 녹이기
        startLoop();


        printAnswer();

    } // end of main

    public static void inputData(){
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n][m];
        visit = new boolean[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                map[i][j] = sc.nextInt();
            }
        }
    } // end of inputData()

    public static void startLoop() {
        while (true) {

            int iceCnt = countIce();
            if (iceCnt == 0){ // map이 다 0으로 채워진 경우
                answer = 0;
                return;
            }
            if (iceCnt >= 2) return; // 이미 빙산이 분리된 경우

            // 1조각인 경우 빙산 녹이기 실시
            bfsOfMeltingIce(); // 일단 빙산을 한번 녹으면 1년 ++
            answer++; // 여기까지 수행하고 나서 while(true)니까 다시 반복문 수행
            // 다시 countIce를 해서 결과값이 2이상이 나오면 함수를 종료하고 answer return
            // 빙산을 녹인 후에도 계속 1조각인 경우 다시 빙산녹이기 시행
        }
    } // end of startLoop()


    // 이 메서드 두 패턴 외우기
    public static int countIce(){
        visit = new boolean[n][m];
        int ice = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(visit[i][j]==false && map[i][j]>0){
                    dfsOfCountIce(i,j);
                    ice++;
                }
            }
        }
        return ice;
    } // end of countIce()

    public static void dfsOfCountIce(int x, int y){
        visit[x][y] = true;
        for(int i=0; i<4; i++){ // 시계방향으로 탐색
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if(nextX>=0 && nextX<n && nextY>=0 && nextY<m && map[nextX][nextY]!=0 && !visit[nextX][nextY]){
                dfsOfCountIce(nextX,nextY);
            }

        }
    } // end of dfsOfCounrIce()

    public static void bfsOfMeltingIce(){
        Queue<int[]> q = new LinkedList<>();
        visit = new boolean[n][m]; // 이 코드가 필요한 이유 :
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j] > 0){
                    q.add(new int[]{i,j});
                    visit[i][j] = true;
                }
            }
        }

        while(!q.isEmpty()){
            int minus=0;
            int[] arr = q.poll();

            for(int i=0; i<4; i++){
                int nx = arr[0] + dx[i];
                int ny = arr[1] + dy[i];

                if(nx>=0 && nx<n && ny>=0 && ny<m && visit[nx][ny]== false && map[nx][ny]==0){
                    minus++;
                }
            }
            if(map[arr[0]][arr[1]]-minus < 0){
                map[arr[0]][arr[1]] = 0;
            }else{
                map[arr[0]][arr[1]]-=minus;
            }
        } // end of while



    } // end of bfsOfMeltingIce()

    public static void printAnswer(){
        System.out.println(answer);
    }
}
