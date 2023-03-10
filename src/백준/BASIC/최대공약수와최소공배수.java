package 백준.BASIC;

import java.util.Scanner;

public class 최대공약수와최소공배수 {
    //static int n1,n2;

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

    // 이렇게 코드 짜면 안됨. 최소공배수가 꼭 같은 i에서 나온다는 보장 없음.
    // 틀린코드인건 알겠는데 왜 계속 0이 출력되는지 모르겠음
    public int 최소공배수(int n1, int n2){
        int i = 2;
        boolean flag = true;
        while(flag){
            n1 = n1*i;
            n2 = n2*i;
            if(n1==n2){
                flag = false;
                //return n1; 여기에 return을 해주면 오류,, 최소공배수 메소드가 return을 해야하므로 while문 밖에서 return
            }
        } // end while
        return n1;
    } // end 최소공배수()
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        최대공약수와최소공배수 T = new 최대공약수와최소공배수();
        int n1 = kb.nextInt();
        int n2 = kb.nextInt();
        System.out.println(T.최대공약수(n1,n2)); // 정답 나옴
        System.out.println(T.최소공배수(n1,n2));


    } // end main
}
