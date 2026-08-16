package Programmers.Lv2.게임맵최단거리;

import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        int[] dy = {-1, 1, 0, 0};
        int[] dx = {0, 0, -1, 1};

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0,0});

        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int y = cur[0]; // 행
            int x = cur[1]; // 열

            if(y == n-1 && x ==m-1) return maps[y][x];

            for(int i=0; i<4; i++){
                int ny = y + dy[i];
                int nx = x + dx[i];

                if(ny<0 || ny>=n ||nx<0||nx>=m) continue;

                if (maps[ny][nx] != 1) continue;


                maps[ny][nx] = maps[y][x] + 1;

                queue.offer(new int[]{ny,nx});
            }

        }
        return -1;
    }
}