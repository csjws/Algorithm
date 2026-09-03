package SWEA.D4.블록제거게임_26071;

import java.util.*;
import java.io.FileInputStream;

class Solution {

    static int result;

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }

            result = 0;

            dfs(list, 0);

            System.out.println("#" + test_case + " " + result);
        }
    }

    static void dfs(List<Integer> list, int sum) {
        // 크기가 1이면 자기 밖에 안남은거니
        if (list.size() == 1) {
            sum += list.get(0);
            result = Math.max(result, sum);
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            // 곱셈에 영향을 주지 않도록 1
            int left = 1;
            int right = 1;

            //삭제할 블럭의 왼쪽
            if (i - 1 >= 0) {
                left = list.get(i - 1);
            }

            //삭제할 블럭의 오른쪽
            if (i + 1 < list.size()) {
                right = list.get(i + 1);
            }

            int s = left * right;
            //삭제
            int remove = list.remove(i);

            dfs(list, sum + s);

            //되돌리기
            list.add(i, remove);
        }

    }
}
