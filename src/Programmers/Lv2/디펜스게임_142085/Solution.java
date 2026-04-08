package Programmers.Lv2.디펜스게임_142085;

import java.util.*;
class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i=0; i<enemy.length; i++){
            pq.offer(enemy[i]);
            n -= enemy[i];
            if(n<0){
                if(k>0){
                    n += pq.poll();
                    k--;
                }
                else{
                    return i;
                }

            }
        }

        return enemy.length;
    }
}
