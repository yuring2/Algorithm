package swea.d2;

import java.util.Scanner;

public class 중간평균값구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int[] arr = new int[10];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            // 10개의 숫자 입력받기
            for(int i=0; i<10; i++){
                arr[i] = sc.nextInt();
            }

            // 최댓값, 최소값 구하기
            for(int i=0; i<10; i++){
                if(arr[i] > max) max = arr[i];
                if(arr[i] < min) min = arr[i];
            }

            double sum = 0;
            for(int i=0; i<10; i++){
                if(arr[i]!=max && arr[i]!=min) sum+=arr[i];
            }

            //System.out.println("#"+tc+" "+Math.round(sum/8)); // 이렇게 하면 테스트코드 통과 못함. Math.round() 함수에는 double, float 함수만 들어갈 수 있는데 sum/8은 정수임
            System.out.println("#"+tc+" "+Math.round(sum/8));



        }
    } // end of main
}
