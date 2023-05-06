package swea.d2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 교환학생 {
    public static void main(String[] args) throws Exception{
        //Scanner sc = new Scanner(System.in);
        //int T = sc.nextInt();
        //int cnt = 0; // 수업을 며칠 들었는지 카운트하기 위한 변수
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int T = Integer.parseInt(st.nextToken());


        for(int tc=1; tc<=T; tc++){
            st = new StringTokenizer(bf.readLine());
            //int cnt = 0; 카운트를 여기다 두면 안되지..
            int result = Integer.MAX_VALUE;
            int N = Integer.parseInt(st.nextToken()); // 며칠 수업을 들을것인지
            int[] arr = new int[7];
            st = new StringTokenizer(bf.readLine());
            // 배열 입력받기
            for(int i=0; i<arr.length; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            //
            for(int i=0; i<7; i++){
                if(arr[i]==0) continue;
                int cnt = 0;
                int start = i; // 배열에서 1이 들어있는 칸의 인덱스 찾기
                int day = 0;
                while(true) {
                    if (arr[start % 7] == 1) cnt++; // 1이 처음 있는 그 칸에서 시작
                    start++; day++;
                    if (cnt == N){
                        result = Math.min(result,day);
                        break;
                    }
                }
            }

            System.out.println("#"+tc+" "+result);

        }
    } // end of main
}
