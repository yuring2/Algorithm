package 프로그래머스.Level1.해시;
import java.util.*;
public class 완주하지못한선수_해시 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        String answer = "";
        for(String player : participant){
            // 동명이인이 있을 수 있기 때문에 이전에 있던 값에서 1을 증가한 값을 넣어주도록 해야한다.
            map.put(player, map.getOrDefault(player, 0)+1);
        } // end for

        for(String player : completion){
            map.put(player,map.get(player)-1);
        } // end for

        for(String key : map.keySet()){ // map이 가지고 있는 키를 하나하나씩 꺼내본다.
            if(map.get(key) != 0){
                answer = key;
                break;
            }
        } // end for

        return answer;
    } // end solution()
}
