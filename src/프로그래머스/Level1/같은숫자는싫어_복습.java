package 프로그래머스.Level1;
import java.util.ArrayList;
public class 같은숫자는싫어_복습 {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int chNum = -1;
        for(int i=0; i<arr.length; i++){
            if(chNum!=arr[i]){
                chNum = arr[i];
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    } // end of solution()
}
