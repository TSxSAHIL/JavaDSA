import java.util.*;

public class NEWW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] A = new int[N+1][M+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        long[][] dp = new long[N+1][M+1];
        dp[1][1] = A[1][1];
        for (int i = 2; i <= N; i++) {
            dp[i][1] = dp[i-1][1] * A[i][1];
        }
        for (int j = 2; j <= M; j++) {
            dp[1][j] = dp[1][j-1] * A[1][j];
        }
        for (int i = 2; i <= N; i++) {
            for (int j = 2; j <= M; j++) {
                dp[i][j] = dp[i-1][j] * dp[i][j-1] / dp[i-1][j-1] * A[i][j];
            }
        }
        long K = sc.nextLong();
        int i = 1, j = 1;
        long ans = 0;
        while (i <= N && j <= M) {
            long product = dp[i][j] / dp[i-1][j] / dp[i][j-1] * dp[i-1][j-1];
            if (product <= K) {
                ans += j;
                j++;
            } else {
                i++;
            }
        }
        System.out.println(ans);
    }
}
