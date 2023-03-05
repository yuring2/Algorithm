package 프로그래머스.고득점kit.완전탐색;

import java.util.*;
// 목표 : 모든 명함을 넣을 수 있는 가장 작은 지갑 만들기
// 특수규칙 : 모든 명함을 회전이 가능함
class 최소직사각형 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_w = 0; // 가로의 최대길이
        int max_h = 0; // 세로의 최대길이

        for(int i=0; i<sizes.length; i++){
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            max_w = Math.max(max_w,w);
            max_h = Math.max(max_h,h);
        }
        return answer = max_w*max_h;
    } // end of solution()
}
