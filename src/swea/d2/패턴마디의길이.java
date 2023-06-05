package swea.d2;

import java.util.Scanner;

public class 패턴마디의길이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            String str = sc.next();
            int ans = 0;

            for(int i=2; i<str.length()/2; i++){
                String s = str.substring(0,i);
                if(s.equals(str.substring(i,i*2))){
                    ans = s.length();
                    break;
                }
            }
            System.out.println("#"+tc+" "+ans);
        }

    } // end of main

}
