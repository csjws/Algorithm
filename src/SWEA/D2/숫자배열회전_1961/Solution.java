package SWEA.D2.숫자배열회전_1961;

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
            int n =sc.nextInt();
            int[][] arr = new int[n][n];
            for(int i = 0; i<n; i++){
                for(int j=0; j<n; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            int[][] r90 = new int[n][n];
            int[][] r180 = new int[n][n];
            int[][] r270 = new int[n][n];

            // 90
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    r90[i][j] = arr[n - 1 - j][i];
                }
            }

            // 180
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    r180[i][j] = arr[n - 1 - i][n - 1 - j];
                }
            }

            // 270
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    r270[i][j] = arr[j][n - 1 - i];
                }
            }

            System.out.println("#" + test_case);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(r90[i][j]);
                }
                System.out.print(" ");
                for (int j = 0; j < n; j++) {
                    System.out.print(r180[i][j]);
                }
                System.out.print(" ");
                for (int j = 0; j < n; j++) {
                    System.out.print(r270[i][j]);
                }
                System.out.println();
            }
        }
    }
}
