import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M1 = scanner.nextInt();
        int P1 = scanner.nextInt();
        int M2 = scanner.nextInt();
        int P2 = scanner.nextInt();
        int[] dp = new int[N + 1];
        dp[0] = 0;
        for (int i = 1; i <= N; i++) {
            dp[i] = Integer.MAX_VALUE;
            if (i >= M1) {
                dp[i] = Math.min(dp[i], dp[i - M1] + P1);
            }

            if (i >= M2) {
                dp[i] = Math.min(dp[i], dp[i - M2] + P2);
            }
        }
        System.out.println(dp[N]);
    }
}
