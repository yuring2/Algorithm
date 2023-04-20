package 프로그래머스.고득점kit.완전탐색;
import java.util.*;
class 소수찾기_복습 {
    HashSet<Integer> set = new HashSet<>();
    public boolean isPrime(int num){
        if(num==0 || num==1) return false;

        // 에라토스테네스의 체
        int limit = (int)Math.sqrt(num);

        for(int i=2; i<=limit; i++){
            if(num%i==0) return false;
        }

        return true;
    }

    public void recursive(String comb, String others){
        if(!comb.equals("")) set.add(Integer.valueOf(comb));

        for(int i=0; i<others.length(); i++){

            recursive(comb+others.charAt(i), others.substring(0,i)+others.substring(i+1));
        }
    }

    public int solution(String numbers) {
        int count = 0;

        recursive("",numbers);
        Iterator<Integer> it = set.iterator(); // 소수 개수 카운트

        while(it.hasNext()){
            int num = it.next();
            if(isPrime(num)) count++;
        }

        return count;

    } // end of solution()
}
