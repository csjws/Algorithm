package Baekjoon.Silver.S4.덱2_28279;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            if(num == 1){
                int k = Integer.parseInt(st.nextToken());
                deque.offerFirst(k);
            }
            else if(num == 2){
                int k = Integer.parseInt(st.nextToken());
                deque.offer(k);
            }
            else if(num == 3){
                if(deque.isEmpty())
                    sb.append(-1).append("\n");
                else sb.append(deque.poll()).append("\n");
            }
            else if(num == 4){
                if(deque.isEmpty())
                    sb.append(-1).append("\n");
                else sb.append(deque.pollLast()).append("\n");
            }
            else if(num == 5){
                sb.append(deque.size()).append("\n");
            }
            else if(num == 6){
                if(deque.isEmpty())
                    sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }
            else if(num == 7){
                if(deque.isEmpty())
                    sb.append(-1).append("\n");
                else sb.append(deque.peek()).append("\n");
            }
            else if(num == 8){
                if(deque.isEmpty())
                    sb.append(-1).append("\n");
                else sb.append(deque.peekLast()).append("\n");
            }
        }

        System.out.print(sb);
    }
}
