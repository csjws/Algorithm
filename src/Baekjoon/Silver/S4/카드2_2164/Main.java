package Baekjoon.Silver.S4.카드2_2164;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while(queue.size() > 1){
            queue.poll();
            queue.offer(queue.poll());
        }

        System.out.println(queue.poll());
    }
}
