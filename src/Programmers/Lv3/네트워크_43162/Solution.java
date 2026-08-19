package Programmers.Lv3.네트워크_43162;

class Solution {

    static boolean[] visited;

    public int solution(int n, int[][] computers) {
        visited = new boolean[n];

        int result = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                result++;
                dfs(i, computers);
            }
        }

        return result;
    }

    static void dfs(int cur, int[][] computers) {
        visited[cur] = true;

        for (int next = 0; next < computers.length; next++) {
            if (computers[cur][next] == 1 && !visited[next]) {
                dfs(next, computers);
            }
        }
    }
}