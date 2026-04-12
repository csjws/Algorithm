package Baekjoon.Silver.S4.스택_10828;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String str = sc.next();
            if(str.equals("push")){
                int num = sc.nextInt();
                stack.push(num);
            }
            else if(str.equals("pop")){
                if(!stack.isEmpty()){
                    System.out.println(stack.pop());
                }
                else{
                    System.out.println(-1);
                }

            }
            else if(str.equals("size")){
                System.out.println(stack.size());
            }
            else if(str.equals("empty")){
                if(stack.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }
            else if(str.equals("top")){
                if(!stack.isEmpty()){
                    System.out.println(stack.peek());
                }
                else{
                    System.out.println(-1);
                }
            }
        }
    }
}
