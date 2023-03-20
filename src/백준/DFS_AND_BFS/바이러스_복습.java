package 백준.DFS_AND_BFS;

import java.util.Scanner;

public class 바이러스_복습 {
    static int comN;
    static int k; // 간선의 수
    static int[][] network;
    static int[] ch;
    static int cnt;
    public void solution(int D){

        if(ch[D]==1) return;

        ch[D] = 1;
        cnt++;
        for(int i=1; i<=comN; i++){
            if(ch[i] == 0 && network[D][i]==1){
                solution(i);
            }
        }
    } // end solution

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        바이러스 T = new 바이러스();
        comN = kb.nextInt();
        k = kb.nextInt();
        network = new int[comN+1][comN+1];
        ch = new int[comN+1];
        for(int i=0; i<k; i++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            network[a][b] = network[b][a] = 1;
        } // end for
        T.solution(1); // 1번 컴터
        System.out.println(cnt-1);
    } // end main
}
