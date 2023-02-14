package 프로그래머스.Level1.해시;

import java.util.*;
// sorting, loop을 활용한 solution
class 전화번호목록_sorting_loop {
    public boolean solution(String[] phone_book) {
        // 1. phone_book을 정렬한다.
        Arrays.sort(phone_book);

        // 2. 1중 loop을 돌면서 앞번호가 뒷번호의 접두어인지 확인한다.
        for(int i=0; i<phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])) return false;
        } //end for

        // 3. 여기까지 왔다면 접두어가 없다는 것이다.
        return true;
    } // end solution()
}
