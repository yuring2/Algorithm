package 백준.약점체크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 틀린코드 다시풀기
// 삼성 sw 역략테스트 기출
// 연산자와 피연산자(숫자)가 두개 들어오면 그때그때 계산하고 다음 단계로 넘기면 되는 문제 입니다.
//
public class 연산자끼워넣기 {
    static int n;
    static int[] op;
    static int[] Narr;
    static int Nmin, Nmax;
    // count = 1이면 1번째 항 즉 두 번째 index까지(1번방) 처리했다는 소리
    public void DFS(int result, int count){ //  count : 항. 처음에는 0이 넘어옴 0번째 항,  result : 현재까지 계산된 값
        if(count == n-1){  // 여기까지 왔으면 모든 결과가 result에 들어가 있다?
            if(Nmax < result){
                Nmax = result;
            }
            if(Nmin > result){
                Nmin = result;
            }
            return; // 이게 왜 필요한거지?
        } // end if

        for(int i=0; i<4; i++){  // 연산자가 4개니까
            if(op[i] != 0) {
                op[i]--;  // 한 번 사용했으니까 --

                if (i == 0) {  // 덧셈
                    DFS(result + Narr[count + 1], count + 1);
                } else if (i == 1) { // 뺄셈
                    DFS(result - Narr[count + 1], count + 1);
                } else if (i == 2) { // 곱셈
                    DFS(result * Narr[count + 1], count + 1);
                } else if (i == 3) { // 나눗셈
                    DFS(result / Narr[count + 1], count + 1);
                }
            } // end if
            op[i]++;
        } // end for

    } // end DFS()
    public static void main(String[] args) throws IOException {
        연산자끼워넣기 T = new 연산자끼워넣기();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine()); // 숫자의 개수
        op = new int[4]; // 연산자 배열
        Narr = new int[n];
        String s = bf.readLine(); // 수열읽기
        StringTokenizer st = new StringTokenizer(s);
        for(int i=0; i<n; i++){
            Narr[i] = Integer.parseInt(st.nextToken());
        } // end for

        // 연산자 입력받기
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<4; i++){
            op[i] = Integer.parseInt(st.nextToken());
        } // end for
        Nmin = 1000000000; // 최소값
        Nmax = -1000000000; // 최대값
        T.DFS(Narr[0], 0);
        System.out.println(Nmax);
        System.out.println(Nmin);
    } // end main
}
