package 백준.DFS_AND_BFS;

import java.util.Scanner;
// DFS
public class A를B로 {
    static long a,b;
    static int answer = Integer.MAX_VALUE;
    static int cnt = 0;
    public void DFS(long num){
        if(num > b) return;
        if(num==b){
            answer = Math.min(answer, cnt);
        }
        else{
            cnt++;
            DFS(num*2);
            DFS(num*10+1);
            cnt--;
        } // end else
    } // end solution()
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        A를B로 T = new A를B로();
        a = kb.nextInt();
        b = kb.nextInt();
        T.DFS(a);
        if(answer==Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(answer+1);

    } // end main
}
