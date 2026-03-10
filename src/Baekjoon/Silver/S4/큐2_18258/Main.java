package Baekjoon.Silver.S4.큐2_18258;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Integer> q = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String str = br.readLine();

            if(str.startsWith("push")){
                int num = Integer.parseInt(str.split(" ")[1]);
                q.offer(num);
            }
            else if(str.equals("pop")){
                if(q.isEmpty())
                    sb.append(-1).append("\n");
                else
                    sb.append(q.poll()).append("\n");
            }
            else if(str.equals("size")){
                sb.append(q.size()).append("\n");
            }
            else if(str.equals("empty")){
                sb.append(q.isEmpty() ? 1 : 0).append("\n");
            }
            else if(str.equals("front")){
                if(q.isEmpty())
                    sb.append(-1).append("\n");
                else
                    sb.append(q.peek()).append("\n");
            }
            else if(str.equals("back")){
                if(q.isEmpty())
                    sb.append(-1).append("\n");
                else
                    sb.append(q.peekLast()).append("\n");
            }
        }

        System.out.print(sb);
    }
}
