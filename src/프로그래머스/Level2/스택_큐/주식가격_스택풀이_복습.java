package 프로그래머스.Level2.스택_큐;
import java.util.*;
public class 주식가격_스택풀이_복습 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<prices.length; i++){
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]){
                answer[stack.peek()] = i-stack.peek();
                stack.pop();
            }
            stack.push(i); // 스택에 인덱스를 push
        }

        while(!stack.isEmpty()){
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }
        return answer;
    } // end of solution()
}
