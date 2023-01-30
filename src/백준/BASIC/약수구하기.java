package 백준.BASIC;

import java.util.Scanner;

public class 약수구하기 {
    static int n, k;
    static int cnt;

    //static int[] arr;
    public void solution(int n, int m) {
        for (int i = 1; i <= n; i++) {
            //if(n%i == 0) arr[i] = i;
            if (n % i == 0) cnt++;
            if (cnt == m) {
                System.out.println(i);
                return;
            }
        } //end for
        System.out.println(0);
    } // end solution()

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        약수구하기 T = new 약수구하기();
        n = kb.nextInt(); // 자연수
        k = kb.nextInt(); // 몇 번째
        T.solution(n,k);

        //arr = new int[n+1];
    } // end main
}
