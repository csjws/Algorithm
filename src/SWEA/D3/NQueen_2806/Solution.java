package SWEA.D3.NQueen_2806;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static int n;
    static int[] queen;
    static int result;

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            n = sc.nextInt();
            queen = new int[n];

            result = 0;

            dfs(0);

            System.out.println("#"+test_case+" "+ result);
        }
    }
    static void dfs(int row){
        if(row == n){
            result++;
            return;
        }
        for(int col =0; col<n; col++){
            if(check(row,col)){
                queen[row] =  col;
                dfs(row + 1);
            }
        }
    }

    static boolean check(int row, int col){
        for(int i = 0; i<row; i++){
            if(queen[i] == col){
                return false;
            }

            if(Math.abs(row-i) == Math.abs(col - queen[i])){
                return false;
            }
        }

        return true;
    }

}
