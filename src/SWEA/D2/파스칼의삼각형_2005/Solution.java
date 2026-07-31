package SWEA.D2.파스칼의삼각형_2005;

import java.util.Scanner;
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
            int n = sc.nextInt();

            int[][] list = new int[n][n];

            list[0][0] = 1;

            for (int i = 1; i < n; i++) {
                for (int j = 0; j <= i; j++) {

                    if (j == 0 || j == i) {
                        list[i][j] = 1;
                    } else {
                        list[i][j] = list[i - 1][j - 1] + list[i - 1][j];
                    }
                }
            }

            System.out.println("#" + test_case);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(list[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
