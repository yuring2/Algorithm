package 프로그래머스.Level2.스택_큐;
import java.util.*;

public class 프린터_복습 {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        int answer = 0;

        for(int i=0; i<priorities.length; i++){
            pq.add(priorities[i]);
        }

        while(!pq.isEmpty()){
            for(int i=0 ; i<priorities.length; i++){
                if(priorities[i] == pq.peek()){
                    if(i==location){
                        answer++;
                        return answer;
                    }
                    pq.poll();
                    answer++;
                }
            }
        } // end of while
        return answer;
    }
}
