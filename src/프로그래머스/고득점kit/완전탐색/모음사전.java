package 프로그래머스.고득점kit.완전탐색;

import java.util.*;
// 스택 오버플로우임
// 다시
public class 모음사전{
    static String[] vowel = {"A","E","I","O","U"};
    //static String s = "";
    static int cnt = 0;
    static int answer;
    public static void dfs(String answer_word, String start, int cnt){
        //if(start!="") s+=start;
        if(start.equals(answer_word) || cnt==5){
            if(start.equals(answer_word)){
                answer = cnt;
            }
            return;
        }
        for(int i=0; i<5; i++){
            dfs(answer_word, start+vowel[i], cnt+=1);
        }
    } // end of dfs
    public static void main(String[] args) {
      dfs("AAAAA","", cnt);
      System.out.println(answer);
    } // end of main
}