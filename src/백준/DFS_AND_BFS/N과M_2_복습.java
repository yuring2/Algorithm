package 백준.DFS_AND_BFS;

import java.util.Scanner;

public class N과M_2_복습 {
    private static int n,m;
    private static boolean[] visit;
    private static int[] answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        visit = new boolean[n+1];
        answer = new int[m];
        dfs(0);
    } // end of main

    private static void dfs(int num){
        if(num==m){
            for(int k : answer) System.out.print(k + " ");
            System.out.println();
            return;
        }
        for(int i=1; i<=n; i++){
            if(visit[i]==false){
                visit[i] = true;
                answer[num] = i;
                dfs(num+1);
                for(int j=i+1; j<=n; j++){
                    visit[j] = false;
                }
            }
        }
    } // end of dfs
}

