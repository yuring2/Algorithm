package swea.d2;

import java.util.Scanner;

public class 초심자의회문검사1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            boolean test = true;
            String str = sc.next();
            int len = str.length();
            for(int i=0; i<len/2; i++){
                if(str.charAt(i)==str.charAt(len-i-1)) test = true;
                else test = false;
            }

            if(test == true) System.out.println("#"+tc+" "+"1");
            else System.out.println("#"+tc+" "+"0");
        }

    } // end of main
}
