package Programmers.Lv2.카카오프렌즈컬러링북_1829;

import java.util.*;
class Solution {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static boolean[][] visited;

    /*
    영역 구하는 문제여서 dfs?
    */
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        visited = new boolean[m][n];

        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                //방문하지 않았고 색칠하지 않는 영역이 아닌것
                if(!visited[i][j] && picture[i][j] != 0){
                    int size = dfs(i,j,m,n,picture);
                    numberOfArea++;
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea,size);
                }
            }
        }


        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;


        return answer;
    }

    static int dfs(int row, int col,int m, int n, int[][] picture){

        visited[row][col] =true;

        // dfs안에 들어오면 한칸이기 때문에 1부터 시작
        int size = 1;

        for(int i=0; i<4; i++){
            int nx = row + dx[i];
            int ny = col + dy[i];

            if(nx<0|| nx>=m|| ny<0||ny>=n) continue;

            //방문했다면
            if(visited[nx][ny]) continue;

            //색이 다르면
            if(picture[row][col] != picture[nx][ny]) continue;

            size += dfs(nx,ny,m,n,picture);

        }
        return size;
    }
}
