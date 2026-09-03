package SWEA.D3.퍼펙트셔플_3499;

import java.util.*;
import java.io.FileInputStream;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();

            ArrayDeque<String> q1 = new ArrayDeque<>();
            ArrayDeque<String> q2 = new ArrayDeque<>();

            if (n % 2 == 0) { // 짝수일 때
                // 앞
                for (int i = 0; i < n / 2; i++) {
                    q1.offer(sc.next());
                }
                // 뒤
                for (int i = 0; i < n / 2; i++) {
                    q2.offer(sc.next());
                }
            } else { // 홀수 일때
                // 앞
                for (int i = 0; i < n / 2 + 1; i++) {
                    q1.offer(sc.next());
                }
                // 뒤
                for (int i = 0; i < n / 2; i++) {
                    q2.offer(sc.next());
                }
            }

            ArrayList<String> list = new ArrayList<>();

            // q1 q2이 비어있지 않다면 순서대로 list에
            while (!q1.isEmpty() || !q2.isEmpty()) {
                if (!q1.isEmpty()) {
                    list.add(q1.poll());
                }

                if (!q2.isEmpty()) {
                    list.add(q2.poll());
                }
            }

            String[] result = new String[list.size()];

            for (int i = 0; i < n; i++) {
                result[i] = list.get(i);
            }

            System.out.print("#" + test_case + " ");
            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }
}
