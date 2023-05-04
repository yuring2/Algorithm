package swea.d2;

import java.util.Scanner;

public class 두개의숫자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int max = Integer.MIN_VALUE;
            int N = sc.nextInt(); // N개의 숫자
            int M = sc.nextInt(); // M개의 숫자
            int[] Narr = new int[N];
            int[] Marr = new int[M];
            //배열 입력받기
            for(int i=0; i<N; i++){
                Narr[i] = sc.nextInt();
            }
            for(int i=0; i<M; i++){
                Marr[i] = sc.nextInt();
            } //


         /*   int Nlen = Narr.length;

         int Mlen = Marr.length;*/  // 길이를 구할필요가 없음 위에서 n,m을 입력 받았으니까

        // 무조건 N이 더 작다고 가정하고 문제를 풀것임
        if(N>M){
            int temp = N; N=M; M=temp;
            int[] tmpArr = Narr; Narr=Marr; Marr=tmpArr;
        }
//M-N+1
        for(int i=0; i<(M-N)+1; i++){
            int tempNum = 0;
            for(int j=0; j<Narr.length; j++){
               tempNum += Narr[j]*Marr[i+j];
            }
            if(tempNum > max) max = tempNum;
        }
            System.out.println("#"+tc+" "+ max);
        }
    } // end of main
}
