package Baekjoon.Silver.S2.스택수열_1874;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int cur = 1;
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            while(num>=cur){
                stack.push(cur++);
                sb.append("+").append("\n");
            }

            if(stack.peek()==num){
                stack.pop();
                sb.append("-").append("\n");
            }
            else{
                System.out.println("NO");
                return;
            }

        }
        System.out.println(sb.toString());

    }
}
