package 프로그래머스.Level1.해시;
import java.util.*;
class 완주하지못한선수_정렬방식_복습{
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])) return participant[i];
        }
        return participant[participant.length-1];
    }
}
