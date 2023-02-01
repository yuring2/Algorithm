package 백준.BASIC;

import java.util.Scanner;

public class 피보나치수5_2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // 10
        int[] arr = new int[n + 1]; // 11
        for(int i=0; i<arr.length; i++){ //11
            if(i==0) arr[i] = 0;
            else if(i==1) arr[i] = 1;
            else arr[i] = arr[i-1]+arr[i-2];
        } // end for
        System.out.println(arr[n]);
    } // end main
}
