package 백준.DFS_AND_BFS;

import java.util.Scanner;
// 시간초과
// scanner  + sout 로 반복출력을 할 경우 시간초과
//V2 에서 scanner + StringBuilder로 풀이
public class n과m_3 {
    private static int n, m;
    private static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        dfs(0);
    } // end of main

    public static void dfs(int d){

        if(d==m) {
            for (int k : arr) System.out.print(k + " ");

            System.out.println();
            return;
        }

        for(int i=1; i<=n; i++){
            arr[d] = i;
            dfs(d+1);
        }
    } // end of dfs
}
