package SWEA.D3.부분수열의합_2817;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static int n, k, result;
    static int[] list;

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {

            n = sc.nextInt();
            k = sc.nextInt();

            list = new int[n];

            for(int i=0; i<n; i++){
                list[i]=sc.nextInt();
            }

            result = 0;

            dfs(0,0);

            System.out.println("#" + test_case +" "+ result);

        }
    }

    static void dfs(int index, int sum){
        if(sum == k){
            result++;
            return;
        }

        if(sum > k){
            return;
        }

        if(index == n){
            return;
        }

        //선택 X
        dfs(index + 1, sum);

        //선택 O
        dfs(index + 1, sum + list[index]);

    }
}
