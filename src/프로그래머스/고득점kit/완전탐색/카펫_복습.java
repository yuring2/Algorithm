package 프로그래머스.고득점kit.완전탐색;

import java.util.*;
class 카펫_복습 {

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown+yellow;

        for(int i=3; i<sum; i++){
            int j = sum/i;

            if(sum%i==0 && j >= 3){
                int column = Math.max(i,j);
                int row = Math.min(i,j);

                int center = (column-2)*(row-2); // 중앙 위치

                if(center==yellow){
                    answer[0] = column;
                    answer[1] = row;
                    return answer;
                }
            }
        }
        return answer;
    }
}
