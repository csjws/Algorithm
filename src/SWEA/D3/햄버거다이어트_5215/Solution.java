package SWEA.D3.햄버거다이어트_5215;

import java.util.*;
class Solution
{
    static int best;
    static int[] kcal;
    static int[] ta;
    static int n;
    static int l;
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            n = sc.nextInt();
            l = sc.nextInt();
            kcal = new int[n];
            ta = new int[n];
            for(int i = 0; i<n;i++){
                ta[i] = sc.nextInt();
                kcal[i]=sc.nextInt();
            }
            best =0;
            dfs(0,0,0);
            System.out.println("#"+test_case+" "+best);
        }
    }
    static void dfs(int index, int sumk, int sumt){
        if(sumk>l) return;
        if(index==n){
            best = Math.max(best,sumt);
            return;
        }
        dfs(index+1,sumk, sumt);
        dfs(index+1,sumk+kcal[index],sumt+ta[index]);
    }
}
