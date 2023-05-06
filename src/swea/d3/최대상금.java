package swea.d3;

import java.util.Scanner;

public class 최대상금 {
    static String[] arr;
    static int max,exchange;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            arr = sc.next().split("");
            exchange = sc.nextInt();
            max = 0;
            // 시간초과 최적화
            if(arr.length < exchange) {	// swap 횟수가 자릿수보다 클 때
                exchange = arr.length;	// 자릿수만큼만 옮겨도 전부 옮길 수 있음
            }
            DFS(0,0);
            System.out.println("#" + tc+ " " + max);
        }



    } // end of main

    static void DFS(int start, int cnt){  // 0,0
        if(cnt==exchange){
            String result = "";
            for(String s: arr) result+=s;
            max = Math.max(max,Integer.parseInt(result));
            return; // return 코드 생각해보기
        }



        // 아직 사용자가 입력한 교환횟수(exchange)만큰 교환이 이루어지지 않은 경우
        for(int i=start; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                // swap
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                DFS(i,cnt+1); // 1이 넘어가면 1번 교환완료했다는 의미
                // 백트래킹 (다시 원래의 상태로 원상복귀)
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    } // end of DFS()
}
