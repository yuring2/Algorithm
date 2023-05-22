package swea.d2;

import java.util.Scanner;

public class 숫자배열회전 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
           int N = sc.nextInt();
           int[][] arr = new int[N][N]; // 입력받을 배열
           String[][] newArr = new String[N][3]; // 새로만들 배열

           // 배열입력받기
           for(int i=0; i<N; i++){
               for(int j=0; j<N; j++){
                   arr[i][j] = sc.nextInt();
               }
           }

          // 90도 회전
           for(int j=0; j<N; j++){
               String str = "";
               for(int x=N-1; x>=0; x--){
                   str += String.valueOf(arr[x][j]);
               }
               newArr[j][0] = str;
           }

           // 180도 회전
           int index = 0;
           for(int x=N-1; x>=0; x--){
               String str = "";
               for(int y=N-1; y>=0; y--){
                   str+=String.valueOf(arr[x][y]);
               }
               newArr[index][1] = str; index++;
           }

           // 270도 회전
           index = 0;
           for(int x=N-1; x>=0; x--){
               String str = "";
               for(int y=0; y<N; y++){
                   str+=String.valueOf(arr[y][x]);
               }
               newArr[index][2] = str; index++;
           }

           System.out.println("#"+tc);
           for(int i=0; i<N; i++){
               for(int j=0; j<3; j++){
                   System.out.print(newArr[i][j] + " ");
               }
               System.out.println();
           }
        }
    } // end of main
}
