package 프로그래머스.Level1;

import java.util.ArrayList;


import java.util.*;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int chNum = -1;
        for(int i=0; i<arr.length; i++){
            if(chNum!=arr[i]){
                chNum = arr[i];
                list.add(arr[i]);
            }
        } // end for
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    } // end solution()
}
