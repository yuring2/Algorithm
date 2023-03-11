package 프로그래머스.고득점kit.그래프;

import java.util.*;
class 가장먼노드_bfs {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        //int[] dis = new int[n+1];
        boolean[] visit = new boolean[n+1];


        for(int i=0; i<=n; i++) graph.add(new ArrayList());

        for(int i=0; i<edge.length; i++){
            graph.get(edge[i][0]).add(edge[i][1]);
            graph.get(edge[i][1]).add(edge[i][0]); // 양방향 처리
        }

        //for(int i=1; i<=n; i++) Collections.sort(graph.get(i));

        // bfs
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        visit[1] = true;

        while(!q.isEmpty()){
            int qsize = q.size();
            for(int i=0; i<qsize; i++){
                int node = q.poll();
                for(int j=0; j<graph.get(node).size(); j++){
                    if(visit[graph.get(node).get(j)]==false){
                        visit[graph.get(node).get(j)] = true;
                        q.offer(graph.get(node).get(j));
                    }
                }
            }
            answer = qsize;
        }
        return answer;
    } // end of solution()
}
