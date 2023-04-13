package 프로그래머스.Level2.스택_큐;

public class 주식가격_반복문풀이_복습 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length;j++){
                answer[i]++;
                if(prices[i]>prices[j]) break;
            }
        }
        return answer;
    } // end of solution()
}
