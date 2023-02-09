package 프로그래머스.Level2.스택_큐;

import java.util.*;
class 다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0; // 걸리는 시간
        Queue<Integer> q = new LinkedList<Integer>();
        int sum = 0; // 다리를 건너는 트럭들의 무게 합
        for(int x : truck_weights){
            while(true){
                if(q.isEmpty()){ // 큐가 비어있는 경우
                    q.offer(x);
                    sum+=x;
                    answer+=1;
                    break;
                }
                else if(q.size()==bridge_length) sum-=q.poll();
                else{
                    if(sum+x > weight){
                        q.offer(0);
                        answer+=1;
                    }
                    else{
                        q.offer(x);
                        sum+=x;
                        answer+=1;
                        break;
                    }
                }
            } // end while
        } // end for
        return answer+bridge_length;
    } // end solution()
}
