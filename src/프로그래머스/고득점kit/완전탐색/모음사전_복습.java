package 프로그래머스.고득점kit.완전탐색;

class 모음사전_복습 {
    static String[] vowel = {"A","E","I","O","U"};
    static int answer;
    static int cnt = 0;
    public static void dfs(String answer_word, String start){
        if(start.equals(answer_word) || start.length()==5){
            if(start.equals(answer_word)){
                answer = cnt;
            }
            return;
        }
        for(int i=0; i<5; i++){
            cnt++;
            dfs(answer_word, start+vowel[i]);
        }
    }  // end of dfs()

    public int solution(String word) {
        dfs(word,"");
        return answer;
    }

}

