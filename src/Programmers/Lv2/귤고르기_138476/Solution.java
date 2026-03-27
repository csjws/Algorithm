package Programmers.Lv2.귤고르기_138476;

import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<tangerine.length; i++){
            map.put(tangerine[i],map.getOrDefault(tangerine[i],0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1,o2) -> map.get(o2)-map.get(o1));
        for(int i : list){
            if(k <=0){
                break;
            }
            answer++;
            k -= map.get(i);
        }
        return answer;
    }
}
