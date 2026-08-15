package SWEA.D4.SW문제해결기본4일차길찾기_1219;

import java.util.*;

class Solution
{

    static int[] first;
    static int[] second;
    static boolean[] visited;
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=10;


        for(int test_case = 1; test_case <= T; test_case++)
        {
            int test = sc.nextInt();
            int n = sc.nextInt();

            first = new int[100];
            second = new int[100];
            visited = new boolean[100];

            for(int i = 0; i< n; i++){
                int from = sc.nextInt();
                int to = sc.nextInt();

                if(first[from] == 0){
                    first[from] =to;
                }else{
                    second[from] = to;
                }
            }

            if(dfs(0)) System.out.println("#"+test+" 1");
            else System.out.println("#"+test+" 0");


        }
    }

    static boolean dfs(int cur){

        if(cur == 99) return true;

        visited[cur] = true;

        //첫 번째 길
        int next = first[cur];
        if(next != 0 && !visited[next]){
            if(dfs(next)){
                return true;
            }
        }

        //두 번째 길
        next = second[cur];
        if(next != 0 && !visited[next]){
            if(dfs(next)){
                return true;
            }
        }

        return false;
    }
}
