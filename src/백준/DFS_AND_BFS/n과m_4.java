package 백준.DFS_AND_BFS;

import java.util.Scanner;

public class n과m_4 {
    static int n;
    static int m;
    static int[] answer;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        answer = new int[m];
        dfs(0);
        System.out.println(sb);
    } // end of main

    public static void dfs(int index){

        if(index==m){
            for(int k : answer){
                sb.append(k + " ");
            }
            sb.append("\n");  //System.out.println();
            return;
        }

        // 기준 수보다 작은 수를 쌍으로 갖지 않는다.
        for(int i=1; i<=n; i++){
            if(index != 0 && answer[index-1] > i) continue;
            answer[index] = i;
            dfs(index+1);
        }
    } // end of dfs()
}
