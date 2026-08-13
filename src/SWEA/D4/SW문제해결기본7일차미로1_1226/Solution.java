package SWEA.D4.SW문제해결기본7일차미로1_1226;

import java.util.*;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
    static char[][] list;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static boolean[][] visited;
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=10;


        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = sc.nextInt();

            list = new char[16][16];

            for(int i = 0;i<16; i++){
                String str = sc.next();
                for(int j =0; j<16; j++){
                    list[i][j] = str.charAt(j);
                }
            }

            visited = new boolean[16][16];

            if(dfs(1,1)){
                System.out.println("#"+n+" 1");
            }else{
                System.out.println("#"+n+" 0");
            }
        }
    }

    static boolean dfs(int row, int col){
        if(row == 11 && col ==11) return true;

        visited[row][col] = true;

        for(int i =0; i<4; i++){
            int nx = row +dx[i];
            int ny = col +dy[i];

            if(nx<0|| nx>=16|| ny<0|| ny>=16) continue;

            if(list[nx][ny] == '1') continue;

            if(visited[nx][ny]) continue;

            if(dfs(nx, ny)) return true;

        }


        return false;
    }
}