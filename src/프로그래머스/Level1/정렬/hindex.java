package 프로그래머스.Level1.정렬;

import java.util.*;
class hindex {
    public int solution(int[] citations) {
        int answer = 0;
        // 논문 인용 횟수를 담은 배열을 오름차순으로 정렬한다.
        // 정렬 한 후에 앞에서부터 가면서 맨 처음 h-index가 성립한 순간을 고르면 된다.
        // 끝까지 해보지 않고 첫 번째만 바로 찾으면 되는 이유는, 갈수록 인용된 논문의 수가 줄어
        // 들기 때문에 맨 처음에 성립하는 부분만 확인하면 된다.
        Arrays.sort(citations);
        for(int i=0; i<citations.length; i++){
            int h = citations.length-i;
            if(citations[i] >= h){
                answer = h;
                break;
            }
        }
        return answer;
    }
}
