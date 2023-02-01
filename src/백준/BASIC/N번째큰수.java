package 백준.BASIC;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class N번째큰수 {
    static int t;
    static int[] Narr;
    static int n=-1;
    public void solution(Integer[] arr){
        Arrays.sort(arr, Collections.reverseOrder());
        n++;
        Narr[n] = arr[2];
        //n++;
    } // end solution()
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        N번째큰수 T = new N번째큰수();
        t = kb.nextInt(); // 테스트케이스의 개수
        Narr = new int[t]; // 처음에 new int[4]이렇게 했음,, 당연히 t값은 매번 변하기 때문에 다른 테스트케이스로 실행해보면 ArrayIndexOutOfBounds발생,, 이런실수좀하지마라
        for(int i=0; i<t; i++){
            Integer[] arr = new Integer[10];
            for(int j=0; j<10; j++){
                arr[j] = kb.nextInt();
                //T.solution(arr); 이걸 여기에 넣으면 nullpointexception이 발생하자나..
            }
            T.solution(arr);
        } // end for
        for(int x : Narr) System.out.println(x);
    } // end main
}
