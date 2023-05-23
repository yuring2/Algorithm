package swea.d2;

import java.util.Scanner;

public class 시각덧셈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            int hour = sc.nextInt();
            int minute = sc.nextInt();
            hour+=sc.nextInt();
            minute+=sc.nextInt();

            hour+=minute/60;
            minute%=60;
            hour%=12;
            if(hour==0) hour=12;

            System.out.println("#"+tc+" "+hour+" "+minute);

        }
    } // end of main
}
