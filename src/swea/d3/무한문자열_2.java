package swea.d3;

import java.util.Scanner;

public class 무한문자열_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            String s1 = sc.next(); // 처음에 입력받은 문자열
            String s2 = sc.next();
            String S1 = s1; //
            String S2 = s2;
            String result = "no";

            // 두 문자열의 길이가 다른 경우
            if(s1.length()!=s2.length()){
                int len = lcd(s1.length(), s2.length());
                while(S2.length()!=len) S2+=s2;
                while(S1.length()!=len) S1+=s1;
            }

            if(S1.equals(S2)) result = "yes";
            System.out.println("#"+tc+" "+result);
        }



    } // end of main

    static int lcd(int a, int b){ // 최소공배수
        int min = ((a*b) / gcd(a,b));
        return min;
    }
    static int gcd(int a, int b){ // 최대공약수
        boolean flag = true;
        int i=0;
        int max = 0;
        while(flag){
            i++;
            if(i > a || i > b) flag = false;
            else if(a%i==0 && b%i==0) max = i;
        }
        return max;
    }


}
