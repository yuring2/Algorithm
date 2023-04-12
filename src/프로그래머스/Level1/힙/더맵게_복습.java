package 프로그래머스.Level1.힙;

import java.util.*;
class 더맵게_복습 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        // 우선순위큐
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<scoville.length; i++){
            pq.add(scoville[i]);
        }

        while(pq.peek() < K){
            if(pq.size() == 1) return -1;
            pq.add(pq.poll() + pq.poll()*2);
            answer++;
        }

        return answer;
    } // end of solution()
}
