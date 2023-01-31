package 백준.BASIC;

import java.util.Scanner;

public class 이진수2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        for(int i=0; i<t; i++){
            String s = Integer.toBinaryString(kb.nextInt());
            for(int j=s.length()-1; j>=0; j--){
                if(s.charAt(j)=='1') System.out.print(s.length()-j-1 + " ");
            } // end for
        }
    } // end main
}
