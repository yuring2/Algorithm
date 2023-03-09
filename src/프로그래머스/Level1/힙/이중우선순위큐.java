package 프로그래머스.Level1.힙;

import java.util.*;
class 이중우선순위큐 {
    public int[] solution(String[] operations) {
        //String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        int[] answer = new int[2];
        //최소 힙, 최대 힙
        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());

        for (String op : operations) {
            StringTokenizer st = new StringTokenizer(op);
            String key = st.nextToken();
            int val = Integer.parseInt(st.nextToken());

            if(minQ.size()==0 && key.equals("D")) continue;

            if (key.equals("I")) {
                minQ.offer(val);
                maxQ.offer(val);
                continue;
            }

            if(val < 0) {
                int min = minQ.poll();
                maxQ.remove(min);
                continue;
            }else{
                int max = maxQ.poll();
                minQ.remove(max);
            }
        }

        if(minQ.size() > 0 ) { // 만약 큐에 아무 원소도 들어있지 않았다면 배열에는 0 0 이 들어있음.
            answer[0] = maxQ.poll();
            answer[1] = minQ.poll();
        }
        return answer;
    } // end of solution()
}