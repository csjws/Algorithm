package Baekjoon.Silver.S3.도키도키간식드리미_12789;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = sc.nextInt();
        int cnt = 1;
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            if(num == cnt){
                cnt++;
                while(!stack.isEmpty() && stack.peek() == cnt){
                    stack.pop();
                    cnt++;
                }
            }
            else{
                stack.push(num);
            }
        }
        if(stack.isEmpty()){
            System.out.println("Nice");
        }
        else{
            System.out.println("Sad");
        }
    }
}
