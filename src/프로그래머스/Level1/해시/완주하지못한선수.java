package 프로그래머스.Level1.해시;
// sort/loop 이용한 풀이
import java.util.*;
class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])) return participant[i];
        } // end for

        // 여기까지 왔다면, 마지막 주자가 완주하지 못한 선수다.
        return participant[participant.length-1];
    }
} 
