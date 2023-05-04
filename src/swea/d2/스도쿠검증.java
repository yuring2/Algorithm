package swea.d2;

import java.util.Scanner;

public class 스도쿠검증 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
           int[][] arr = new int[9][9];
            int[] checkArr;
            boolean flag = false;
            // 배열 입력 받기
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[i].length; j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            // 가로 확인
            for(int i=0; i<arr.length; i++){
                checkArr = new int[arr.length]; // 이건 한 행마다 초기화가 필요하니까
                for(int j=0; j<arr[i].length; j++){
                    checkArr[arr[i][j]-1]=1;
                }

                for(int k=0; k<arr.length; k++){
                    if(checkArr[k]==0){
                        flag = true; // 다음행이 1~9의 모든 수를 포함하고 있어봤자 이미 true임
                        break;
                    }
                }
                // 여기도?
            }

            // 중간중간에 코드 삽입하기 만약 flag가 true이면 뒤에 코드 볼 필요 없음

            // 세로 확인
            for(int i=0; i<arr.length; i++){
                checkArr = new int[arr.length];
                for(int j=0; j<arr[i].length; j++){
                    checkArr[arr[j][i]-1]=1;
                }

                for(int k=0; k<arr.length; k++){
                    if(checkArr[k]==0){
                        flag = true;
                        break;
                    }
                }
            }

            // 작은 정사각형 확인
            //checkArr = new int[arr.length];
            for(int i=0; i<=6; i+=3) {  // 행을 위해서

                for (int j = 0; j <= 6; j += 3) { // 열을 위해서
                    checkArr = new int[arr.length];
                    for (int x = i; x < i+3; x++) {
                        for (int y = j; y < j+3; y++) {
                            checkArr[arr[x][y] - 1] = 1;
                        }
                    }

                    for (int k = 0; k < arr.length; k++) {
                        if (checkArr[k] == 0) {
                            flag = true;
                            break;
                        }
                    }
                }
            }

            if(flag)
                System.out.println("#"+tc+" "+0);
            else
                System.out.println("#"+tc+" "+1);

        }
    } // end of main
}
