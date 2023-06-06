package swea.d3;

import java.util.Scanner;

public class 체스판위의룩배치 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            char[][] arr = new char[8][8];
            String result = "yes";
            // 배열 입력받기
            for(int i=0; i<arr.length; i++){
                String s = sc.next();
               for(int j=0; j<arr[i].length; j++){
                   arr[i][j] = s.charAt(j);
               }
            }

            int[] check = new int[8];
            for(int i=0; i< arr.length; i++){
                int cnt = 0; // 룩의 개수를 샌다.
                //check = new int[8];
                for(int j=0; j<arr[i].length; j++){
                    if(check[j]==0 && arr[i][j]=='O'){
                        cnt++;
                        check[j] = 1;
                    }
                }
                if(cnt!=1) result = "no";
                if(result=="no") break;
            }
            System.out.println("#"+tc+" "+result);
        }


    } // end of main
}
