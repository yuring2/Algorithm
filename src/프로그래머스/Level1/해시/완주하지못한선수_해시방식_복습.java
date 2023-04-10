package 프로그래머스.Level1.해시;
import java.util.*;
public class 완주하지못한선수_해시방식_복습 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        String answer = "";
        for(String player : participant){
            map.put(player, map.getOrDefault(player, 0)+1); // 동명이인 고려
        }

        for(String player : completion){
            map.put(player,map.get(player)-1);
        }

        for(String key : map.keySet()){
            if(map.get(key) != 0){
                answer = key;
                break;
            }
        }
        return answer;
    } // end of solution()
}
