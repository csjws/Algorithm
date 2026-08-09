package SWEA.D2.조교의성적매기기_1983;
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
            int n = sc.nextInt();
            int k = sc.nextInt();
            String[] grade = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};

            double[] score = new double[n];
            for(int i =0; i<n; i++){
                int m = sc.nextInt();
                int f = sc.nextInt();
                int w = sc. nextInt();

                score[i] = m*0.35 + f*0.45 + w *0.20;
            }
            double target = score[k - 1];

            int rank = 0;
            for (int i = 0; i < n; i++) {
                if (score[i] > target) {
                    rank++;
                }
            }

            String result = grade[rank / (n / 10)];

            System.out.println("#" + test_case + " " + result);
        }
    }
}