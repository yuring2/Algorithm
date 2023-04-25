package swea.d2;
import java.io.*;
import java.util.StringTokenizer;

public class 백만장자프로젝트_복습 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int t=0; t<T; t++){
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            for(int i=0; i<N; i++){
                arr[i] = Integer.parseInt((st.nextToken()));
            }

            long max = 0;
            int sum = 0;
            for(int i = N-1; i>=0; i--){
                if(max < arr[i]) max = arr[i];
                else{
                    sum+=max-arr[i];
                }
            }
            System.out.println("#" + (t+1) + " " + sum);
        }
    } // end of main
}
