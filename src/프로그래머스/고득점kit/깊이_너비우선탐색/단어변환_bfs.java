package 프로그래머스.고득점kit.깊이_너비우선탐색;

import java.util.*;

class StringAndIdx{
    String s;
    int idx;
    StringAndIdx(String str, int i){
        this.s = str;
        this.idx = i;
    }
} // end of StringAndIdx

public class 단어변환_bfs {
    public static boolean[] visited;
    public static int[] dis;
    public static int answer = 0;
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        dis = new int[words.length+1];
        // 1. 일단 words 안에 target이 있는지 확인
        if(Arrays.asList(words).contains(target)){ // 가장 마지막에 타켓으로 변환을 해주어야 하기 때문에
            bfs(begin,target,words);
            return answer;
        }else{
            return 0;
        }
    } // end of solution()

    static void bfs(String begin, String target, String[] words){
        Queue<StringAndIdx> q = new LinkedList<>();
        q.add(new StringAndIdx(begin,0));
        while(!q.isEmpty()){
            StringAndIdx out = q.poll();
            if(out.s.equals(target)) return; // 이코드를 위에 넣으면?

            for(int i=0; i<words.length; i++){
                int cnt = 0;
                String str = words[i];
                if(visited[i]) continue;
                else{
                    for(int j=0; j<out.s.length(); j++){
                        if(str.charAt(j)==out.s.charAt(j)) cnt++;
                    }

                    if(cnt == out.s.length()-1){
                        visited[i] = true;
                        q.add(new StringAndIdx(words[i],i+1));
                        dis[i+1] = dis[out.idx]+1;
                        answer = dis[i+1];
                    }
                } // end else
            } // end of for

        } // end of while
    } // end of bfs()
}




