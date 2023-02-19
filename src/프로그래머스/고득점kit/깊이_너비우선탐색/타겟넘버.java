package 프로그래머스.고득점kit.깊이_너비우선탐색;

class 타겟넘버 {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers,0,target,0);
        return answer;
    } // end solution()

    public void dfs(int[] numbers, int depth, int target, int sum){

        if(depth == numbers.length){
            if(sum==target) answer++;
        }else{
            dfs(numbers,depth+1,target,sum+numbers[depth]);
            dfs(numbers,depth+1,target,sum-numbers[depth]);
        }

    } // end dfs()
}
