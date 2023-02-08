package 프로그래머스.Level2.스택_큐;

import java.util.*;
class 프린터 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());

        for(int i=0; i<priorities.length; i++){
            pq.add(priorities[i]);
        } // end for

        while(!pq.isEmpty()){ // 모든 대기목록이 비워질 때 까지
            for(int i=0 ; i<priorities.length; i++){
                if(priorities[i] == pq.peek()){
                    if(i==location){
                        answer++;
                        return answer;
                    }
                    pq.poll();
                    answer++;
                } // end if
            }
        } // end while
        return answer;
    }
}
