package 프로그래머스.고득점kit.완전탐색;

import java.util.*;
// k는 유저의 현재 피로도
// 던전을 탐험한 이후에는 현재 유저의 피로도-소모피로도
// 각 던전은 하루에 한번만 탐험이 가능 -> 이미 탐험한 던전은 확인체크
// 목표 : 유저가 오늘 최대한 많은 던전을 탐험하고자 함
// dfs
class 피로도 {
    static boolean[] check;
    static int answer = 0;
    public void dfs(int[][] dungeons, int startNum, int cnt){
        for(int i=0; i<dungeons.length; i++){
            //if(check[i]==true) continue;
            if(!check[i] && startNum >= dungeons[i][0]){
                //int num = startNum - dungeons[i][1]; // 방문
                check[i] = true; // 방문확인
                dfs(dungeons, startNum - dungeons[i][1], cnt+1);
                check[i] = false;
            } // end of if
        }
        answer = Math.max(cnt,answer);
    } // end of dfs
    public int solution(int k, int[][] dungeons) {
        check = new boolean[dungeons.length];
        dfs(dungeons, k, 0);
        return answer;
    }
}
