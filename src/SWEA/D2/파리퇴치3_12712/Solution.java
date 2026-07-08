package SWEA.D2.파리퇴치3_12712;

import java.util.*;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[][] arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int max = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    int plus = arr[i][j];
                    int cross = arr[i][j];
                    for (int k = 1; k < M; k++) {
                        // + 모양
                        if (i - k >= 0) plus += arr[i - k][j];
                        if (i + k < N) plus += arr[i + k][j];
                        if (j - k >= 0) plus += arr[i][j - k];
                        if (j + k < N) plus += arr[i][j + k];
                        // X 모양
                        if (i - k >= 0 && j - k >= 0) cross += arr[i - k][j - k];
                        if (i - k >= 0 && j + k < N) cross += arr[i - k][j + k];
                        if (i + k < N && j - k >= 0) cross += arr[i + k][j - k];
                        if (i + k < N && j + k < N) cross += arr[i + k][j + k];
                    }

                    max = Math.max(max, Math.max(plus, cross));
                }
            }

            System.out.println("#" + test_case + " " + max);
        }

    }
}
