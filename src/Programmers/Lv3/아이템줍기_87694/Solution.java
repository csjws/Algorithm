package Programmers.Lv3.아이템줍기_87694;

import java.util.*;
class Solution {
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        ArrayDeque<int[]> q = new ArrayDeque<>();
        int[][] map = new int[102][102];
        boolean[][] visited = new boolean[102][102];

        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};

        characterX *=2;
        characterY *=2;
        itemX *=2;
        itemY *=2;

        // 도형안 1로 채움
        for(int[] r : rectangle){
            int x1 = r[0]*2;
            int y1 = r[1]*2;
            int x2 = r[2]*2;
            int y2 = r[3]*2;

            for(int x = x1; x<=x2; x++){
                for(int y = y1; y<=y2; y++){
                    map[x][y] = 1;
                }
            }
        }

        //도형 내부만 0으로 변경
        for(int[] r : rectangle){
            int x1 = r[0]*2;
            int y1 = r[1]*2;
            int x2 = r[2]*2;
            int y2 = r[3]*2;

            for(int x = x1; x<=x2; x++){
                for(int y = y1; y<=y2; y++){
                    if(x>x1 && x<x2 && y>y1 && y<y2){
                        map[x][y] =0;
                    }
                }
            }
        }

        visited[characterX][characterY] = true;
        q.offer(new int[]{characterX,characterY,0});

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            int cnt = cur[2];

            if(x == itemX && y == itemY) return cnt/2;

            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx<0|| nx>=102|| ny<0||ny>=102) continue;

                if(visited[nx][ny]) continue;

                if(map[nx][ny] == 0) continue;

                visited[nx][ny] =true;
                q.offer(new int[]{nx,ny,cnt+1});
            }
        }
        return 0;
    }
}