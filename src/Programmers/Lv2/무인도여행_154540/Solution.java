package Programmers.Lv2.무인도여행_154540;

import java.util.*;

class Solution {
    static String[] mapsArr;
    static boolean[][] visited;
    static int n, m;

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public int[] solution(String[] maps) {
        mapsArr = maps;
        n = maps.length;
        m = maps[0].length();
        visited = new boolean[n][m];

        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && mapsArr[i].charAt(j) != 'X') {
                    results.add(bfs(i, j));
                }
            }
        }

        if (results.isEmpty()) {
            return new int[]{-1};
        } else {
            Collections.sort(results);
            return results.stream().mapToInt(Integer::intValue).toArray();
        }
    }

    static int bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        visited[x][y] = true;

        int sum = mapsArr[x].charAt(y) - '0';

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int cx = cur[0], cy = cur[1];

            for (int d = 0; d < 4; d++) {
                int nx = cx + dx[d];
                int ny = cy + dy[d];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m
                        && !visited[nx][ny] && mapsArr[nx].charAt(ny) != 'X') {
                    visited[nx][ny] = true;
                    sum += mapsArr[nx].charAt(ny) - '0';
                    q.offer(new int[]{nx, ny});
                }
            }
        }
        return sum;
    }
}

