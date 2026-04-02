package Baekjoon.Silver.S1.절댓값힙_11286;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) ->{
            if(Math.abs(a)==Math.abs(b)){
                return a - b;
            }
            return Math.abs(a) - Math.abs(b);
        });
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x =  sc.nextInt();
            if(x==0){
                if(pq.isEmpty()){
                    System.out.println(0);
                }
                else{
                    System.out.println(pq.poll());
                }
            }
            else{
                pq.offer(x);
            }
        }

    }
}
