package 프로그래머스.Level2.스택_큐;

import java.util.Stack;

public class 올바른괄호_복습 {
    boolean solution(String s) {
        boolean answer = false;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(') stack.push(s.charAt(i));
            else{
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }

        if(stack.isEmpty()){
            answer = true;
        }
        return answer;
    } // end of solution()
}

