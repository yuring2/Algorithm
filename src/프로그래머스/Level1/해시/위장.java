package 프로그래머스.Level1.해시;

import java.util.HashMap;
import java.util.Iterator;

public class 위장 {
    public int solution(String[][] clothes){
        HashMap<String, Integer> map = new HashMap<>();
        for(String[] clothe : clothes){
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        } // end for

        Iterator<Integer> it = map.values().iterator();
        int answer = 1;
        while(it.hasNext()) answer *= it.next().intValue() +1;

        return answer-1;
    } // end solution()

}
