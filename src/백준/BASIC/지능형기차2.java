package 백준.BASIC;

import java.util.Scanner;

public class 지능형기차2 {
    static int[] in = new int[10];
    static int[] out = new int[10];
    static int maxNum=Integer.MIN_VALUE;
    public void solution(){
        int pNum=0;
        for(int i=0; i<10; i++){
            //pNum - out[i];
            pNum = pNum-out[i];
            pNum = pNum+in[i];
            maxNum = Integer.max(maxNum, pNum);
        } // end for
    } // end solution()
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        지능형기차2 T = new 지능형기차2();
        for(int i=0; i<10; i++){
            out[i] = kb.nextInt();
            in[i] = kb.nextInt();
        } // end for
        T.solution();
        System.out.println(maxNum);
    } // end main
}
