package SWEA.D4.격자판의숫자이어붙이기_2819;

import java.util.*;
import java.io.FileInputStream;

class Solution
{

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static String[][] list;
    static HashSet<String> set;

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

    /*
    4×4 크기의 격자판
    격자판의 임의의 위치에서 시작
    서로 다른 일곱 자리 수들의 개수 -> 0으로 시작하는 0102001과 같은 수를 만들 수도 있다.
    */
        for(int test_case = 1; test_case <= T; test_case++)
        {
            //같은 숫자가 나올 수 있으니 HashSet
            set = new HashSet<>();
            list = new String[4][4];

            for(int i =0; i<4; i++){
                for(int j =0; j<4; j++){
                    list[i][j] = sc.next();
                }
            }

            //모든 방향에서 탐색하기 위해
            for(int i =0; i<4; i++){
                for(int j = 0; j<4; j++){
                    dfs(i, j, list[i][j]);
                }
            }

            System.out.println("#"+test_case+" "+set.size());
        }
    }

    static void dfs(int row, int col, String str){
        // 일곱 자리수를 만드니까
        if(str.length() == 7) {
            set.add(str);
            return;
        }

        for(int i =0; i<4; i++){
            int nx = row + dx[i];
            int ny = col + dy[i];

            if(nx<0 || nx>=4 || ny<0||ny>=4) continue;

            String next = str + list[nx][ny];

            dfs(nx,ny,next);

        }
    }
}