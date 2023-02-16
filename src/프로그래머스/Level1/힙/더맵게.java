package 프로그래머스.Level1.힙;

import java.util.*;
class 더맵게 {
    public int solution(int[] scoville, int K) {
        int answer = 0; // 섞은 횟수
        //1. 우선순위 큐 선언
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++){
            pq.add(scoville[i]);
        } // end for

        // 모든 음식의 스코빌 지수가 7이상이 되어야 하는 것이 조건
        // 따라서 큐에서 peek() 한 값 즉 가장 작은 값이 7보다 크거나 같으면 반복문 종료
        // 즉 큐에서 가장 작은 값이 k보다 작으면 계속 반복
        while(pq.peek() < K){
            if(pq.size() == 1) return -1;
            pq.add(pq.poll() + pq.poll()*2);
            answer++;
        } // end while

        return answer;
    } // end solution()
}
