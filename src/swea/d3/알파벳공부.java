package swea.d3;

import java.util.Scanner;

public class 알파벳공부 {
    static String alpha = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            String s = sc.next();
            int cnt=0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)==alpha.charAt(i)) cnt++;
                else break;
            }
            System.out.println("#"+tc+" "+cnt);
        }


    } // end of main
}
