package Programmers.Lv2.소수찾기_42839;

import java.util.*;
class Solution {
    static HashSet<Integer> set;
    static boolean[] visited;
    static char[] list;

    public int solution(String numbers) {
        set = new HashSet<>();
        list = numbers.toCharArray();
        visited = new boolean[numbers.length()];

        dfs("");

        return set.size();
    }

    private void dfs(String cur) {
        if (!cur.isEmpty()) {
            int num = Integer.parseInt(cur);

            if (isPrime(num)) {
                set.add(num);
            }
        }

        for (int i = 0; i < list.length; i++) {
            if (visited[i]) {
                continue;
            }

            visited[i] = true;
            dfs(cur + list[i]);
            visited[i] = false;
        }
    }
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}