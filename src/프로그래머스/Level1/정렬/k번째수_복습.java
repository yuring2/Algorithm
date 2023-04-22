package 프로그래머스.Level1.정렬;
import java.util.*;
class k번째수_복습 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int[] arr = commands[i];
            List<Integer> list = new ArrayList<Integer>();
            for(int j=arr[0]-1; j<=arr[1]-1; j++){
                list.add(array[j]);
            }

            Collections.sort(list);
            answer[i] = list.get(arr[2]-1);
        }
        return answer;
    } //
}
