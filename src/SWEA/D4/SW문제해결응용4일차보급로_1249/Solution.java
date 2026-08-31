package SWEA.D4.SW문제해결응용4일차보급로_1249;

import java.util.*;
import java.io.FileInputStream;

class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            int[][] list = new int[n][n];

            ArrayDeque<int[]> q = new ArrayDeque<>();

            int[] dx = { -1, 1, 0, 0 };
            int[] dy = { 0, 0, -1, 1 };

            for (int i = 0; i < n; i++) {
                String str = sc.next();
                for (int j = 0; j < str.length(); j++) {
                    list[i][j] = str.charAt(j) - '0';
                }
            }

            q.offer(new int[] { 0, 0 });

            int[][] temp = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    temp[i][j] = Integer.MAX_VALUE;
                }
            }
            temp[0][0] = 0;

            while (!q.isEmpty()) {
                int[] cur = q.poll();
                int x = cur[0];
                int y = cur[1];

                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if (nx < 0 || nx >= n || ny < 0 || ny >= n)
                        continue;

                    int cost = temp[x][y] + list[nx][ny];

                    if (cost < temp[nx][ny]) {
                        temp[nx][ny] = cost;
                        q.offer(new int[] { nx, ny });
                    }

                }
            }

            System.out.println("#" + test_case + " " + temp[n - 1][n - 1]);
        }
    }
}
