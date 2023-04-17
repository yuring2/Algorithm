package 프로그래머스.고득점kit.완전탐색;
import java.util.*;
class 모의고사_복습 {
    public int[] solution(int[] answers) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        int[] records = {0,0,0};

        for(int i=0; i<answers.length; i++){
            if(answers[i]==a[i%5]) records[0]++;
            if(answers[i]==b[i%8]) records[1]++;
            if(answers[i]==c[i%10]) records[2]++;
        }

        int maxNum = Math.max(records[0],Math.max(records[1],records[2]));
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<records.length; i++){
            if(maxNum==records[i]) list.add(i+1);
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    } // end of solution();
}