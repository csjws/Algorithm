package Baekjoon.Silver.S4.요세푸스문제0_11866;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int index = 0;
        for(int i=1;i<=n;i++){
            queue.offer(i);
        }
        while(!queue.isEmpty()){
            for(int j=0;j<k-1;j++){
                queue.offer(queue.poll());
            }
            arr[index++] = queue.poll();
        }
        System.out.print("<");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(", ");
            }
            else {
                System.out.print(">");
            }
        }
    }
}
