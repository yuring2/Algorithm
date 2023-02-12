package 프로그래머스.Level2.스택_큐;

import java.util.*;
public class 주식가격_스택 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<prices.length; i++){
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]){
                answer[stack.peek()] = i-stack.peek();
                stack.pop(); // 답을 구했으면 스택에서 제거
            } // end while
            stack.push(i); // 스택에 인덱스를 push
        } // end for

        while(!stack.isEmpty()){ // 값을 구하지 못한 index == 끝까지 값이 떨어지지 않은 주식
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }
        return answer;
    } // end solution()
}
