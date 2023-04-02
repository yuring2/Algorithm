package 프로그래머스.고득점kit.깊이_너비우선탐색;

import java.util.*;
class 여행경로_복습{
    static boolean[] visited;
    static ArrayList<String> list;

    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        list = new ArrayList<>();
        int cnt = 0;
        bfs("ICN","ICN",cnt,tickets);
        Collections.sort(list);
        String[] answer = list.get(0).split(" ");
        return answer;
    }

    public void bfs(String start, String answer, int cnt, String[][] tickets){
        if(cnt==tickets.length){
            list.add(answer);
            return;
        }


        for(int i=0; i<tickets.length; i++){
            if(visited[i]==false && tickets[i][0].equals(start)){
                visited[i] = true;
                bfs(tickets[i][1], answer+ " " + tickets[i][1], cnt+1, tickets);
                visited[i] = false;
            }
        }
    }


}