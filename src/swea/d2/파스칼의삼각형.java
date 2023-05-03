package swea.d2;

import java.util.Scanner;

public class 파스칼의삼각형 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int N = sc.nextInt(); // 삼각형의 크기
            int[][] arr = new int[N][N];  // 처음에 다 0으로 초기화
            for(int i=0; i<N; i++){
                for(int j=0; j<=i; j++){ // 0행(i=0)일때 한번 돌고 1행일 때 2번돌고,,,
                    if(i==j || j==0) arr[i][j] = 1;
                    else arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }

            System.out.println("#"+tc);
            for(int i=0; i<N; i++){
                for(int j=0; j<=i; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    } // end of main
}
