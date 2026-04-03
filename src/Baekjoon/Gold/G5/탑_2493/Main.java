package Baekjoon.Gold.G5.탑_2493;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        ArrayDeque<int[]> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && stack.peek()[1] < arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                sb.append(0).append(" ");
            } else {
                sb.append(stack.peek()[0]).append(" ");
            }

            stack.push(new int[]{i + 1, arr[i]});
        }

        System.out.println(sb);
    }
}
