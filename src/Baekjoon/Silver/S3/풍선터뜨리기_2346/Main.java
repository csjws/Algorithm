package Baekjoon.Silver.S3.풍선터뜨리기_2346;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int value = sc.nextInt();
            queue.offer(new int[]{i, value});
        }
        List<Integer> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            result.add(cur[0]);
            int move = cur[1];

            if (queue.isEmpty()) break;

            if (move > 0) {
                for (int i = 0; i < move - 1; i++) {
                    queue.offer(queue.poll());
                }
            } else if (move < 0) {
                for (int i = 0; i < Math.abs(move); i++) {
                    queue.offerFirst(queue.pollLast());
                }
            }
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
