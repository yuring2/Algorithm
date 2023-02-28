package 프로그래머스.고득점kit.깊이_너비우선탐색;

import java.util.*;
//bfs로 풀이
class 게임맵최단거리_bfs {
    static int[] dx = {-1,0,1,0}; //행
    static int[] dy = {0,1,0,-1}; //열
    static int[][] visited;
    public int solution(int[][] maps) {
        visited = new int[maps.length][maps[0].length];
        bfs(maps);
        int answer = visited[maps.length-1][maps[0].length-1];

        if(answer==0) answer = -1;

        return answer;
    } // end of solution

    static void bfs(int[][] maps){
        int x = 0;
        int y = 0;
        visited[x][y] = 1;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x,y});

        while(!q.isEmpty()){
            int[] curr = q.poll();
            int currx = curr[0];
            int curry = curr[1];

            for(int i=0; i<4; i++){
                int nx = currx+dx[i];
                int ny = curry+dy[i];

                if(nx<0 || nx>maps.length-1 || ny<0 || ny>maps[0].length-1) continue;

                if(visited[nx][ny]==0 && maps[nx][ny]==1){
                    visited[nx][ny] = visited[currx][curry]+1;
                    q.offer(new int[]{nx,ny});
                }
            }
        }
    } // end of bfs
}
