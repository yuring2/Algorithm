package 프로그래머스.Level2.스택_큐;
// 반목문을 이용한 풀이
import java.util.*;
public class 주식가격 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length;j++){
                answer[i]++;
                if(prices[i]>prices[j]) break;
            }
        } // end for
        return answer;
    }
}
