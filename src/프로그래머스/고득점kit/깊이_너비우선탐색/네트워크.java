package 프로그래머스.고득점kit.깊이_너비우선탐색;

public class 네트워크 {
    static boolean[] visited;
    static void dfs(int i, int[][] computers, int n){
        for(int j=0; j<n; i++){
            if(visited[j] == false && computers[i][j]==1){
                dfs(j,computers,n);
            }
        }
    } // end of dfs
    public int solution(int n, int[][] computers){
        int answer=0;
        visited = new boolean[n];

        for(int i=0; i<n; i++){
            if(visited[i]== false){
                answer++;
                dfs(i,computers,n);
            }
        }

        return answer;
    } // end of solution()
}
