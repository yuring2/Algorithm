package 백준.DFS_AND_BFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS와BFS {
    static int n,m,v;
    static int[][] board;
    static int[] ch;
    public void DFS(int v){
        System.out.print(v + " ");
        for(int i=1; i<=n; i++){
            if(board[v][i] == 1 && ch[i] == 0)
                {
                    //System.out.println(v + " ");
                    ch[i] = 1;
                    DFS(i); // 한 우물만 계속 파야함
                    //ch[i] = 0;
                }
            } // end for
    } // end DFS()

    public void BFS(int v){
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        ch[v] = 1;
        while (!q.isEmpty()){
            int temp = q.poll();
            System.out.print(temp + " ");
            for(int i=1; i<=n; i++){
                if(board[temp][i]==1 && ch[i] == 0){
                    q.add(i);
                    ch[i] = 1;
                }
            } // end for
        } // end while
    } // end BFS()
    public static void main(String[] args) {
        DFS와BFS T = new DFS와BFS();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt(); // 정점의 개수
        m = kb.nextInt(); // 간선의 개수
        v = kb.nextInt(); // 탐색을 시작할 정점의 번호
        board = new int[n+1][n+1];
        ch = new int[n + 1];
        for(int i=0; i<m; i++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            board[a][b] = 1;
            board[b][a] = 1;
        }
        ch[v] = 1;
        T.DFS(v);
        System.out.println(); // DFS()끝나고 개행
        // DFS()가 완료되면 ch(체크배열)를 0으로 초기화 해줘야 함
        Arrays.fill(ch,0);
        T.BFS(v);
    } // end main
}
