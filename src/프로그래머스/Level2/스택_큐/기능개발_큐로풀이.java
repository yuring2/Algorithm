package 프로그래머스.Level2.스택_큐;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Math.ceil() : 소수값이 존재할 때 올리는 역할
public class 기능개발_큐로풀이 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<progresses.length; i++){
            queue.add((int)(Math.ceil((100.0-progresses[i]) / speeds[i])));
        } // end for

        List<Integer> answer = new ArrayList<>();
        while(!queue.isEmpty()){
            int day = queue.poll();
            int count = 1;

            while(!queue.isEmpty() && day >= queue.peek()){
                count++;
                queue.poll();
            }
            answer.add(count);
        } // end while
        return answer.stream().mapToInt(x->x).toArray();
    } // end solution()
}
