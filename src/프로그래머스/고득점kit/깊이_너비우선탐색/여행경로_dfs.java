package 프로그래머스.고득점kit.깊이_너비우선탐색;

import java.util.*;
class 여행경로_dfs {
    static boolean[] visited; // 방문 여부 체크
    static ArrayList<String> list;
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        list = new ArrayList<>();
        int cnt = 0;
        bfs("ICN","ICN",cnt,tickets);
        Collections.sort(list);
        String[] answer = list.get(0).split(" ");
        return answer;
    } // end of solution()

    // 일단 알파벳순을 고려하지 않고 모든 경우의 수를 다 찾는다.
    public void bfs(String start, String answer, int cnt, String[][] tickets){
        if(cnt==tickets.length){
            list.add(answer);
            return; // 더 뻗지 못하도록 return
        }
        for(int i=0; i<tickets.length; i++){  // 0 1 2
            if(visited[i]==false && tickets[i][0].equals(start)){
                visited[i] = true;
                bfs(tickets[i][1], answer+ " " + tickets[i][1], cnt+1, tickets);
                visited[i] = false;
            }
        }
        //return;
    } // end of bfs()
}