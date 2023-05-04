package swea.d3;

import java.util.Scanner;

public class 문제번호_1206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 10;
        for(int tc=1; tc<=T; tc++){
            int N = sc.nextInt(); // 건물개수
            int[] arr = new int[N];
            // 배열 입력받기
            for(int i=0; i<N; i++){
                arr[i] = sc.nextInt();
            }

            int cnt = 0;
            for(int i=2; i<N-2; i++){
                int max = Math.max(arr[i - 2], Math.max(arr[i - 1], Math.max(arr[i + 1], arr[i + 2])));
                if(arr[i] - max > 0) cnt += arr[i] - max;
            }
            System.out.println("#"+tc+" "+cnt);
        }
    } // end of main
}
