package 백준.BASIC;

import java.util.Scanner;
// 백준 통과
public class 최대공약수와최소공배수_3 {

    public int 최대공약수(int n1, int n2){
        int max = 0;
        int i=0;
        boolean flag = true;
        while(flag){
            i++;
            if(i > n1 || i > n2) flag = false;
            else if(n1%i==0 && n2%i==0){
                //max = Math.max(max, i);
                max = i;
            }
        } // end while
        return max;
    } // end 최대공약수()
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        최대공약수와최소공배수_3 T = new 최대공약수와최소공배수_3();
        int n1 = kb.nextInt();
        int n2 = kb.nextInt();
        int gcd_answer = T.최대공약수(n1, n2);
        System.out.println(gcd_answer);
        System.out.println(n1*n2/gcd_answer);
    } // end main
}
