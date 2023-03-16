package 백준.DFS_AND_BFS;

import java.util.Scanner;

public class n과m_3_V2 {
    private static int n, m;
    private static int[] arr;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        dfs(0);
        System.out.println(sb);
    } // end of main

    public static void dfs(int d){

        if(d==m) {
            for (int k : arr){
                sb.append(k + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i=1; i<=n; i++){
            arr[d] = i;
            dfs(d+1);
        }
    } // end of dfs
}
