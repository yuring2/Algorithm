package 백준.BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 쉽게푸는문제 {
    static int a;
    static int b;
    static int[] arr = new int[1001];
    public void solution(){
        int index = 1;
        // 배열의 index가 1001이 될 경우에 종료
        for(int i=1; i<=1000; i++){
            for(int j=0; j<i; j++){
                if(index==1001) break;
                arr[index] = i;
                index++;
            }
        } // end for
    } // end solution()
    public static void main(String[] args) throws IOException {
        쉽게푸는문제 T = new 쉽게푸는문제();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        T.solution();
        int sum = 0;
        for(int i=a; i<=b; i++){
            sum+=arr[i];
        }
        System.out.println(sum);

    } // end main
}
