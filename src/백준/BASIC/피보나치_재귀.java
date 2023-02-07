package 백준.BASIC;

// 메모이제이션
public class 피보나치_재귀 {
    static int[] arr;
    public int fibo(int n){
        if(arr[n]!=0) return arr[n];
        if(n==1) return arr[n]=1; // 1을 넣고 그 값을 return
        if(n==2) return arr[n]=1;
        else return arr[n] = fibo(n - 2) + fibo(n - 1); // 메모이제이션
    }
    public static void main(String[] args) {
        피보나치_재귀 T = new 피보나치_재귀();
        int n = 10;
        arr = new int[n + 1];
        T.fibo(n);
        for(int i=1; i<=n; i++) System.out.print(arr[i] + " ");
        //for(int i=1; i<=10; i++) System.out.println(T.fibo(n)); 메모이제이션을 사용하면 for문을 일일히 돌면서 재귀를 호출하지 않아도 된다.
    } // end main
}
