package Baekjoon.Silver.S1.쉬운계단수_10844;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] dp = new long[n+1][10];
        int mod = 1000000000;

        for(int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            dp[i][0] = dp[i - 1][1] % mod;

            for (int j = 1; j <= 8; j++) {
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % mod;
            }

            dp[i][9] = dp[i - 1][8] % mod;
        }

        long result = 0;
        for (int i = 0; i <= 9; i++) {
            result = (result + dp[n][i]) % mod;
        }

        System.out.println(result);

    }
}
