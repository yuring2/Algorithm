package 백준.BASIC;

import java.util.Scanner;

public class 이진수 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t;
        int n;
        int i=0;

        t = kb.nextInt();
        while(i<t){
            n = kb.nextInt();
            int cnt = 0;
            while(n/2 != 0){   // 이진수 구하기
              if(n%2 == 1) System.out.printf("%d ",cnt);
              cnt++;
              n = n/2;
            }
            System.out.printf("%d ", cnt);
            i++;
        } // end while
    } // end main
}
