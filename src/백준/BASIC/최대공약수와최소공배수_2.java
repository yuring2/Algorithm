package 백준.BASIC;

import java.util.Scanner;
// 유클리드호제법
public class 최대공약수와최소공배수_2 {
    public int gcd(int n1, int n2){
        while(n2!=0){  // n2가 나머지
            int r = n1%n2;
            n1 = n2;
            n2 = r;
        } // end while
        return n1;
    } // end gcd()

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        최대공약수와최소공배수_2 T = new 최대공약수와최소공배수_2();
        int n1 = kb.nextInt();
        int n2 = kb.nextInt();
        int gcd_answer = T.gcd(n1,n2);
        System.out.println(gcd_answer);
        System.out.println(n1*n2/gcd_answer);
    } // end main
}
