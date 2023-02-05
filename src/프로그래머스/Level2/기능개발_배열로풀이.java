package 프로그래머스.Level2;

public class 기능개발_배열로풀이 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] temp = new int[100];
        int day = 0;

        // 각 항목마다 100%까지 검색해야하므로 for문안에 while문이 들어간다.
        for(int i=0; i<progresses.length; i++){
            while(progresses[i]+(speeds[i]*day) < 100){
                day++;
            } // end while
            temp[day]++;
        } // end for

        int count = 0;
        // temp 배열의 길이를 알기위한 코드임
        // temp는 초기에 0으로 선언되어 있으므로 0이 아닌 값만 측정하면 됨
        for(int n:temp){
            if(n!=0) count++;
        }

        // 답을 return하기 위한 answer배열 선언
        int[] answer = new int[count];

        count = 0;
        for(int n:temp){
            if(n!=0) answer[count++]=n;
        }

        return answer;
    } // end solution()
}

