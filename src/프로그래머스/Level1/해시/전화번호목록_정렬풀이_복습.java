package 프로그래머스.Level1.해시;
import java.util.*;

class 전화번호목록_정렬풀이_복습 {
    public boolean solution(String[] phone_book) {

        Arrays.sort(phone_book);

        for(int i=0; i<phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])) return false;
        }

        return true;
    } // end of solution()
}
