package Programmers.Lv2.다리를지나는트럭_42583;

import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        int sum =0;
        for(int t : truck_weights){
            while(true){
                if(q.isEmpty()){
                    q.offer(t);
                    sum += t;
                    answer++;
                    break;
                }
                else if(bridge_length == q.size()){
                    sum -= q.poll();
                }
                else{
                    if(sum + t <= weight){
                        q.offer(t);
                        sum+= t;
                        answer++;
                        break;
                    }
                    else{
                        q.offer(0);
                        answer++;
                    }
                }
            }
        }
        return answer + bridge_length;
    }
}
