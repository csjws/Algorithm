package Baekjoon.Silver.S4.덱_10866;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> q = new ArrayDeque<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String str = sc.next();
            if(str.equals("push_back")){
                int num = sc.nextInt();
                q.offerLast(num);
            }
            else if(str.equals("push_front")){
                int num = sc.nextInt();
                q.offerFirst(num);
            }
            else if(str.equals("pop_front")){
                if(q.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(q.pollFirst());
                }
            }
            else if(str.equals("pop_back")){
                if(q.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(q.pollLast());
                }
            }
            else if(str.equals("size")){
                System.out.println(q.size());
            }
            else if(str.equals("empty")){
                if(q.isEmpty()){
                    System.out.println(1);
                }else System.out.println(0);
            }
            else if(str.equals("front")){
                if(q.isEmpty()) {
                    System.out.println(-1);
                }else{
                    System.out.println(q.peekFirst());
                }

            }
            else if(str.equals("back")){
                if(q.isEmpty()){
                        System.out.println(-1);
                }else{
                    System.out.println(q.peekLast());
                }

            }
        }
    }
}
