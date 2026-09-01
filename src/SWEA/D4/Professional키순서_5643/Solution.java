package SWEA.D4.Professional키순서_5643;

import java.util.*;
import java.io.FileInputStream;

class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            boolean[][] graph = new boolean[n + 1][n + 1];

            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                // a가 b보다 작음
                graph[a][b] = true;
            }

            /*
             * 플로이드-워셜 : 모든 정점에서 모든 정점으로 가는 최단 경로를 구하는 알고리즘
             *
             * i -> 시작
             * j -> 끝
             * k -> 중간
             *
             * k가 제일 먼저 인 이유는 k를 거쳐 j로 갈 수 있는지를 보기 위해
             * i에서 k, k에서 j를 확인하고 i에서 j가 되는 것을 보기 위해
             */
            for (int k = 1; k <= n; k++) {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        // 연결 되어 있다면
                        if (graph[i][k] && graph[k][j]) {
                            graph[i][j] = true;
                        }
                    }
                }
            }

            int result = 0;

            for (int i = 1; i <= n; i++) {
                int cnt = 0;
                for (int j = 1; j <= n; j++) {
                    // 자기 자신 제외
                    if (i == j)
                        continue;

                    // 연결된 것 확인
                    if (graph[i][j] || graph[j][i]) {
                        cnt++;
                    }
                }

                // 자신을 제외
                if (cnt == n - 1)
                    result++;
            }

            System.out.println("#" + test_case + " " + result);
        }
    }
}