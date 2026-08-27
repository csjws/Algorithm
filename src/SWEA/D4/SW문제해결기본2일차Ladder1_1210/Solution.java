package SWEA.D4.SW문제해결기본2일차Ladder1_1210;

import java.util.*;

class Solution
{
    static int[][] list;
    static boolean[][] visited;
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=10;

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int test = sc.nextInt();
            list = new int[100][100];

            for(int i=0; i<100; i++){
                for(int j=0; j<100; j++){
                    list[i][j] = sc.nextInt();
                }
            }

            int result =0;

            for(int i=0; i<100; i++){
                if(list[0][i] == 1){
                    // 이전 방문한 기록이 있으니 초기화
                    visited = new boolean[100][100];
                    if(dfs(0,i)){
                        result = i;
                        break;
                    };
                }
            }
            System.out.println("#"+test+" "+result);
        }
    }

    static boolean dfs(int row, int col){

        //도착지점
        if(list[row][col] == 2) return true;

        visited[row][col] = true;

        // 오른쪽
        if (col + 1 < 100 && list[row][col + 1] != 0 && !visited[row][col + 1]) {
            if (dfs(row, col + 1)) {
                return true;
            }
            return false;
        }

        // 왼쪽
        if (col - 1 >= 0 && list[row][col - 1] != 0 && !visited[row][col - 1]) {
            if (dfs(row, col - 1)) {
                return true;
            }
            return false;
        }

        // 아래
        if (row + 1 < 100 && list[row + 1][col] != 0 && !visited[row + 1][col]) {
            if (dfs(row + 1, col)) {
                return true;
            }
            return false;
        }

        return false;
    }
}
