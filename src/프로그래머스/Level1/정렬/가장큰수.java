package 프로그래머스.Level1.정렬;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수 {
    public String solution(int[] numbers){
        // 정수 배열을 문자열 배열로 바꾸어준다.
        String[] s = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            s[i] = String.valueOf(numbers[i]);
        }

        // 정렬
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        if(s[0].equals("0")) return "0";

        String answer = "";
        for(String str : s) answer+=str;

        return answer;
    }
}
