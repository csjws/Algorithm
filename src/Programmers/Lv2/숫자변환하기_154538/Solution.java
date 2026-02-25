package Programmers.Lv2.숫자변환하기_154538;

import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        boolean[] visit = new boolean[y+1];
        ArrayDeque<int[]>q = new ArrayDeque<>();
        q.offer(new int[]{x,0});
        visit[x] = true;
        while(!q.isEmpty()){
            int[] curInfo = q.poll();
            int cur = curInfo[0];
            int cnt = curInfo[1];
            if(cur ==y)
                return cnt;
            int[] nextArr = {cur+n, cur*2, cur*3};
            for(int next : nextArr){
                if(next <= y && !visit[next]){
                    visit[next] = true;
                    q.offer(new int[]{next,cnt+1});
                }
            }
        }
        return -1;
    }
}
