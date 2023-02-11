package 백준.BASIC;

import java.util.Scanner;

public class 지능형기차2_다른분코드 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int human = 0;
        int max = 0;
        for(int i=0; i<10; i++){
            int out = kb.nextInt();
            int in = kb.nextInt();
            human -= out;
            human += in;
            max = Integer.max(max, human);
        } // end for
            System.out.println(max);
    } // end main
}
