package Programmers.Lv2.PCCP기출문제2번석유시추_250136;

import java.util.*;
class Solution {
    public int solution(int[][] land) {
        int n = land.length;
        int m = land[0].length;

        boolean[][] visit = new boolean[n][m];
        int[] sum = new int[m];

        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                if(!visit[i][j] && land[i][j]==1){
                    bfs(land,visit,i,j,sum);
                }
            }
        }

        int answer =0;
        for(int s : sum){
            answer = Math.max(answer, s);
        }

        return answer;
    }

    int[] dx = {-1,1,0,0};
    int[] dy = {0,0,-1,1};


    void bfs(int[][] land, boolean[][] visit, int i, int j, int[] sum){
        int n = land.length;
        int m = land[0].length;
        Queue<int[]> q = new LinkedList<>();
        HashSet<Integer> columns = new HashSet<>();
        q.offer(new int[]{i,j});
        visit[i][j] = true;

        int size = 0;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];

            size++;
            columns.add(cy);

            for(int k = 0; k<4; k++){
                int nx = cx +dx[k];
                int ny = cy +dy[k];
                if(nx<0 ||ny < 0 || nx>= n || ny>= m) continue;
                if(visit[nx][ny] || land[nx][ny] == 0) continue;

                visit[nx][ny] = true;
                q.offer(new int[]{nx,ny});
            }
        }

        for(int col : columns){
            sum[col] += size;
        }
    }
}

