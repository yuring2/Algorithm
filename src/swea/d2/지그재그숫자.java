package swea.d2;

import java.util.Scanner;

public class 지그재그숫자 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int sum = 0;
            int N = sc.nextInt();
            for(int i=1; i<=N; i++){
                if(i%2==0) sum-=i;
                if(i%2!=0) sum+=i;
            }
            System.out.println("#"+tc+" "+sum);
        }
    }// end of main
}
