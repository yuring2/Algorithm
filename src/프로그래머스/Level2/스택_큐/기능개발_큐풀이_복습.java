package 프로그래머스.Level2.스택_큐;
import java.util.*;

public class 기능개발_큐풀이_복습 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<progresses.length; i++){
            queue.add((int)(Math.ceil((100.0-progresses[i]) / speeds[i])));
        }

        List<Integer> answer = new ArrayList<>();
        while(!queue.isEmpty()){
            int day = queue.poll();
            int count = 1;
            while(!queue.isEmpty() && day >= queue.peek()){
                count++;
                queue.poll();
            }
            answer.add(count);
        }

        return answer.stream().mapToInt(x->x).toArray();
    } // end of solution()
}

