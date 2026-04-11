package Baekjoon.Silver.S3.크리스마스선물_14235;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a==0){
                if(pq.isEmpty()){
                    System.out.println(-1);
                }
                else System.out.println(pq.poll());
            }
            else{
                for(int j =0; j<a; j++){
                    int num = sc.nextInt();
                    pq.offer(num);
                }
            }
        }
    }
}
