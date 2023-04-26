package swea.d2;

import java.util.Scanner;

public class 달팽이숫자 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=0; tc<T; tc++) {
            int N = sc.nextInt(); // size(NXN)
            int[][] arr = new int[N][N];
            int width = N;
            int length = N-1;
            int count = N * N;
            int num = 1;
            int i=0; int j=0;

            while (num <= count) {
                for (int k = 0; k < width; k++) {
                    arr[i][j] = num;
                    j++;
                    num++;
                }width--; j--; i++; // 다음 수행을 위해 세팅

                for (int k = 0; k < length; k++) {
                    arr[i][j] = num;
                    i++;
                    num++;
                }i--; length--; j--;

                for (int k = 0; k < width; k++) {
                    arr[i][j] = num;
                    j--;
                    num++;
                } width--; j++; i--;

                for (int k = 0; k < length; k++) {
                    arr[i][j] = num;
                    i--;
                    num++;
                } length--; i++; j++;
            } // end of while

            System.out.println("#"+(tc+1));
            for (int a = 0; a < arr.length; a++) {
                for (int b = 0; b < arr[a].length; b++){
                    System.out.print(arr[a][b]+ " ");
                }
                System.out.println();
            }
        }
    } // end of main
}
