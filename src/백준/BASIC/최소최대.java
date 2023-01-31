package 백준.BASIC;

import java.util.Scanner;

public class 최소최대 {
    static int n;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int[] arr;
    public void solution(){
        for(int i=0; i<n; i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        } // end for
    } // end solution()
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        최소최대 T = new 최소최대();
        n = kb.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        } // end for
        T.solution();
        System.out.println(min + " " + max);
    } // end main
}
