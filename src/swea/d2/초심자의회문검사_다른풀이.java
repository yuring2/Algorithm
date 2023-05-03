package swea.d2;

import java.util.Scanner;

public class 초심자의회문검사_다른풀이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            String str = sc.next();
            String reverse = new StringBuilder(str).reverse().toString();
            if(str.equals(reverse)) System.out.println("#"+tc+" "+"1");
            else System.out.println("#"+tc+" "+"0");
        }
    } // end of main
}
