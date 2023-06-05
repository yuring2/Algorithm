package swea.d3;

import java.util.Scanner;

// 통나무의 길이가 짝수면 엘리스, 홀수면 밥이 이기는 간단한 문제..
public class 통나무자르기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            String result = "";
            int N = sc.nextInt();
            if(N%2==0) result = "Alice";
            else result = "Bob";

            System.out.println("#"+tc+" "+result);
        }


    } // end of main
}
