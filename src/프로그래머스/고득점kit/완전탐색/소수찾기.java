package 프로그래머스.고득점kit.완전탐색;
import java.util.*;
class 소수찾기 {
    HashSet<Integer> set = new HashSet<>();
    public boolean isPrime(int num){
        // 0과 1은 소수가 아니다.
        if(num==0 || num==1) return false;

        // 에라토스테네스의 체의 limit을 계산한다.
        int limit = (int)Math.sqrt(num);
        // 에라토스테네스의 체에 따라 limit까지만 배수 여부를 확인한다.
        for(int i=2; i<=limit; i++){
            if(num%i==0) return false;
        }

        return true;
    }
    public void recursive(String comb, String others){
        if(!comb.equals("")) set.add(Integer.valueOf(comb));

        // 남은 숫자 중 한개를 더 해 새로운 조합을 만든다.
        for(int i=0; i<others.length(); i++){  // 재귀
            // substring() 다 소문자임 주의,,
            recursive(comb+others.charAt(i), others.substring(0,i)+others.substring(i+1));
        }
    } // end of recursive()

    public int solution(String numbers) {
        int count = 0;
        // 1. 모든 조합의 숫자를 만든다.
        recursive("",numbers);

        // 소수의 개수를 센다.
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            int num = it.next();
            if(isPrime(num)) count++;
        }

        return count; // 소수의 개수 반환
    } // end of solution()
}
