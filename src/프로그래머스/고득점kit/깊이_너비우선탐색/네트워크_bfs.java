package 프로그래머스.고득점kit.깊이_너비우선탐색;

import java.util.LinkedList;
import java.util.Queue;

public class 네트워크_bfs {
    static boolean[] visit;
    static Queue<Integer> q = new LinkedList<>();
    public int solution(int n, int[][] computers){
        int answer = 0;
        visit = new boolean[n];
        for(int i=0; i<n; i++){
            if(visit[i]==false){
                bfs(i,computers,n);
                answer++;
            }
        }
        return answer;
    } // end of solution

    static void bfs(int i, int[][] computers, int n){
        q.offer(i);
        visit[i] = true;

        while(!q.isEmpty()){
            int val = q.poll();
            for(int j=0; j<n; j++){
                if(visit[j]==false && computers[val][j]==1){
                    q.offer(j);
                    visit[j] = true;
                }
            }
        } // end of while

    } // end of bfs
}
