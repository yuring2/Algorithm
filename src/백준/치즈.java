package 백준;

// 치즈에는 하나 이상의 구멍이 있을 수 있다.
// 공기와 접촉한 치즈는 한 시간이 지나면 없어짐

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 목표 : 치즈가 모두 녹아 없어지는데 걸리는 시간과 모두 녹기 한 시간 전에 남아있는 치즈조각의 개수츨력
public class 치즈 {
    private static Scanner sc = new Scanner(System.in);
    private static int[] dx = {-1,0,1,0};
    private static int[] dy = {0,1,0,-1};
    private static int n; // 행
    private static int m; // 열
    private static int[][] map;
    private static int prev = 0;
    private static int hour = 0;

    public static void main(String[] args) {
    // 1. 입력데이터 받기
        inputData();

        bfs();
    } // end of main

    private static void bfs(){
        // bfs 준비
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> Airs = new LinkedList<>();

        // 초기 설정-(0,0)은 언제나 공기
        visited[0][0]=true;
        Airs.add(new int[]{0,0});

        // 녹을 치즈를 발견 -> 그 다음 공기가 됨
        Queue<int[]> newAirs = new LinkedList<>();

        while(true) {
            // bfs로 완탐 --> newAirs 를 만들어간다.
            while (!Airs.isEmpty()) {
                int[] curr = Airs.poll();
                for (int i = 0; i < 4; i++) {
                    int nx = curr[0] + dx[i];
                    int ny = curr[1] + dy[i];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        // 공기면 -> 계속 Airs에 넣고 탐색
                        if (map[nx][ny] == 0) Airs.add(new int[]{nx, ny});
                        else {  // 치즈인 경우 --> 다음 탐색용
                            newAirs.add(new int[]{nx, ny});
                        }
                    }
                }
            } // 1시간 경과

            // 새로운 공기가 없어졌다면? 종료
            if (newAirs.isEmpty()) break;
                // 새로운 공기가 있다면 한
            else {
                prev = newAirs.size();
                hour += 1;

                // 두 개의 큐를 스왑
                Queue<int[]> temp = Airs;
                Airs = newAirs;
                newAirs = temp;
            } // 전체반복 종료
        }
        System.out.println(hour);
        System.out.println(prev);

    } // end of bfs()
    private static void inputData() {
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                map[i][j] = sc.nextInt();
            }
        }
    } // end
}
