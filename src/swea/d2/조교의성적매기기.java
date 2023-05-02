package swea.d2;

import java.util.Scanner;

public class 조교의성적매기기 {
    static String[] grade = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++) {
            int N = sc.nextInt(); // 학생 수
            int K = sc.nextInt(); // 학점을 알고싶은 학생의 번호
            double[] arr = new double[N + 1];

            // 점수 입력받기
            for (int i = 1; i <= N; i++) {
                int mid = sc.nextInt();
                int fin = sc.nextInt();
                int proj = sc.nextInt();

                arr[i] = mid * 0.35 + fin * 0.45 + proj * 0.2;
            }

                // K번째 학생의 등수 구하기
                int cnt = 0;
                for (int i = 1; i <= N; i++) {
                    if (arr[i] > arr[K]) cnt++;
                }

                System.out.println("#" + tc + " " + grade[cnt / (N / 10)]);
            }
        }
    }

