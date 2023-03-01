package 백준.BASIC;

import java.util.Scanner;
// 입력이 0으로 주어지는 경우가 있다. 그 경우엔 길이가 1인 배열이 생성 될 것이고, arr[1]은 잘못된 범위입니다. a[0]만 존재 따라서
// 런타임에러(ArrayIndexOutOfBounds) 발생

public class 피보나치수5 {
    static int n;
    static int[] arr;
    public void solution(){
        for(int i=2; i<=n; i++){
            arr[i] = arr[i - 2] + arr[i - 1];
        } // end for
    } // end solution()
    public static void main(String[] args) {
        피보나치수5 T = new 피보나치수5();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        T.solution();
        System.out.println(arr[n]);
    } // end main
}
