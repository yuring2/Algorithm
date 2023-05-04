package swea.d2;

import java.util.Scanner;

public class 어디에단어가들어갈수있을까_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++) {
            int N = sc.nextInt();
            int K = sc.nextInt(); // 단어의 길이
            int[][] arr = new int[N][N];
            int ans = 0; // 테스트케이스마다 초기화되어야 하니까

            // 배열 입력받기
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            // 가로에 들어갈 수 있는 곳 찾기
           for(int i=0; i<N; i++){
               int check = 0; // 행마다 초기화 되어야 하니까
               for(int j=0; j<N; j++){
                   if(arr[i][j]==0){ // 검은색이면
                       if(check==K){
                           ans++;
                       }
                       check=0;
                   }else{  // 하얀색이면
                       check+=1;  // 여기에서 check++이렇게 하면 안쪽 for문이 끝나면 0으로 되니까 +=
                   }
               }
               if(check == K) {
                   ans ++;
               }
           }

           // 세로에 들어갈 수 있는 곳 찾기
            for(int i=0; i<N; i++){
                int check = 0;
                for(int j=0; j<N; j++){
                    // 검은색인 경우에
                    if(arr[j][i]==0){

                        if(check==K){
                            ans++;
                        }
                        check=0;
                    }else{
                        check++;
                    }
                }
                if(check==K){
                    ans++;
                }
           }
            System.out.println("#"+tc+" "+ans);
        }
    } // end of main
}
