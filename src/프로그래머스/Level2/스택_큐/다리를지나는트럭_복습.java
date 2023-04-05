package 프로그래머스.Level2.스택_큐;
import java.util.*;

class 다리를지나는트럭_복습 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<Integer>();
        int sum = 0; //// 트럭들의 무게 합


        for(int x : truck_weights){
            while(true) {
                if (q.isEmpty()) {
                    q.offer(x);
                    sum += x;
                    answer += 1;
                    break;
                } else if (q.size() == bridge_length) sum -= q.poll();
                else {
                    if (sum + x > weight) {
                        q.offer(0);
                        answer += 1;
                    } else {
                        q.offer(x);
                        sum += x;
                        answer += 1;
                        break;
                    }
                }
            }
        }
        return answer+bridge_length;
    } // end of solution
}
