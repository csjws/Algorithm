package Programmers.Lv2.프로세스_42587;

import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        for(int i = 0; i<priorities.length; i++){
            queue.offer(new int[]{i,priorities[i]});
        }
        while(!queue.isEmpty()){
            int[] cur  = queue.poll();
            boolean high = false;
            for(int[] doc : queue){
                if(doc[1]>cur[1]){
                    high = true;
                    break;
                }
            }
            if(high)
                queue.offer(cur);
            else{
                answer++;
                if(cur[0]==location)
                    return answer++;
            }
        }
        return answer;
    }
}
