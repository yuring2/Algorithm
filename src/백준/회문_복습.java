package 백준;

import java.util.Scanner;

public class 회문_복습 {
    private static int num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i=0; i<num; i++){
            String word = sc.next();
            int answer = decodeWord(word);
            System.out.println(answer);
        }
    }

    public static int decodeWord(String s){
        if(isPalindrome(s)){
            return 0;
        } else if(AlmostPalindrome(s,0,s.length()-1,true)){
            return 1;
        }else{
            return 2;
        }
    } // end of decodeWord

    public static boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.reverse().toString().equals(s)){
            return true;
        }
        return false;
    } // end of isPalindrome

    public static boolean AlmostPalindrome(String s, int left, int right, boolean can_skip) {
        if(left > right) return true;

        if(s.charAt(left)==s.charAt(right)){
            return AlmostPalindrome(s,left+1, right-1, can_skip);
        }else if(can_skip){
            return (AlmostPalindrome(s,left+1,right,false) || AlmostPalindrome(s,left,right-1,false));
        }else{
            return false;
        }
    } // end of AlmostPalindrome
}

