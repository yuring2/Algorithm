package 프로그래머스.Level1.해시;

import java.util.HashMap;

public class 전화번호목록_hash {
    public boolean solution(String[] phone_book){
        // 1. hashMap을 만든다.
        HashMap<String, Integer> map = new HashMap<>();
        for(String s  : phone_book) map.put(s, 1);

        // 2. 모든 전화번호의 접두어가 hashMap에 있는지 확인한다.
        // 중복된 번호는 없기 때문에 119인 경우 1, 11 까지만 map에 있는지 확인을 해주면 된다.
        for(int i=0; i<phone_book.length; i++){
            for(int j=1; j<phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0,j))) return false;
            }
        } // end for
        // 3. 여기까지 왔다면 접두어가 없다는 것이다.
        return true;
    } // end solution()
}
