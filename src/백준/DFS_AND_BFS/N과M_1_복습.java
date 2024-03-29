package 백준.DFS_AND_BFS;

import java.util.Scanner;

public class N과M_1_복습 {
    private static int n, m;
    private static int[] arr;
    private static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m + 1];
        visited = new boolean[n + 1];
        recursion(0);
    } // end of main

    private static void recursion(int index) {
        if (index == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[index] = i;
                recursion(index + 1);
                visited[i] = false;
            }
        }
    }
}
