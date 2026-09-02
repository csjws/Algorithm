package SWEA.D4.Professional줄세우기_3952;

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

            List<Integer>[] graph = new ArrayList[n + 1];

            for (int i = 1; i <= n; i++) {
                graph[i] = new ArrayList<>();
            }

            // 앞에 있어야 하는 사람 표시
            int[] indegree = new int[n + 1];

            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                // b가 a보다 뒤에 있어야한다.
                graph[a].add(b);

                // b가 나올려면 앞에 x명이 필요
                indegree[b]++;
            }

            Queue<Integer> q = new ArrayDeque<>();

            // 줄에 바로 들어 갈 수 있는 사람 넣기
            for (int i = 1; i <= n; i++) {
                if (indegree[i] == 0)
                    q.offer(i);
            }

            System.out.print("#" + test_case + " ");
            while (!q.isEmpty()) {
                int cur = q.poll();
                System.out.print(cur + " ");

                for (int next : graph[cur]) {
                    // cur가 줄에 들어갔으니 감소
                    indegree[next]--;

                    // 0이면 줄에 들어 갈 수 있으니 큐에 넣음
                    if (indegree[next] == 0)
                        q.offer(next);
                }

            }
            System.out.println();
        }
    }
}