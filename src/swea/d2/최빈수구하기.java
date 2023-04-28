package swea.d2;

import java.util.Scanner;

public class 최빈수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=0; tc<T; tc++){
            int N = sc.nextInt();
            int[] arr = new int[101]; // 빈도수 저장할 배열

            for(int i=0; i<1000; i++){
                arr[sc.nextInt()]++;
            }

            int max = 0;
            int index = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i] > max){
                    max = arr[i];
                    index = i;
                }
            }
            System.out.println("#"+N+" "+index);
        }
    } // end of main
}
