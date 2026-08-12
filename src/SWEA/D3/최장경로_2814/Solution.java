package SWEA.D3.최장경로_2814;

import java.util.*;

class Solution
{
    static int n,m,result;
    static ArrayList<Integer>[] list;
    static boolean[] visited;
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();


        for(int test_case = 1; test_case <= T; test_case++)
        {
            n = sc.nextInt();
            m = sc.nextInt();

            list = new ArrayList[n+1];

            for(int i =1; i<=n; i++){
                list[i] = new ArrayList<>();
            }

            visited = new boolean[n+1];
            result =1;

            for(int i=0; i<m; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();

                list[x].add(y);
                list[y].add(x);
            }

            for(int i=1; i<=n; i++){
                dfs(i,1);
            }

            System.out.println("#"+test_case+" "+result);
        }
    }

    static void dfs(int cur, int d){
        result = Math.max(result,d);
        visited[cur] = true;

        for(int next : list[cur]){
            if(!visited[next]){
                dfs(next, d +1);
            }
        }

        visited[cur] = false;
    }
}