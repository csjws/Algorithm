package Programmers.Lv2.더맵게_42626;

import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int s : scoville){
            pq.offer(s);
        }
        while(!pq.isEmpty()&&K>0){
            if(pq.peek()>=K){
                break;
            }
            else if(pq.size()==1){
                return -1;
            }
            else{
                pq.offer(pq.poll()+(pq.poll()*2));
                answer++;
            }
        }
        return answer;
    }
}