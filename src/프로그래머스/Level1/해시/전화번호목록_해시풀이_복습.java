package 프로그래머스.Level1.해시;

import java.util.HashMap;

public class 전화번호목록_해시풀이_복습 {
    public boolean solution(String[] phone_book){
        HashMap<String, Integer> map = new HashMap<>();

        for(String s  : phone_book) map.put(s, 1);

        for(int i=0; i<phone_book.length; i++){
            for(int j=1; j<phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0,j))) return false;
            }
        }

        return true;
    } // end of solution()
}
