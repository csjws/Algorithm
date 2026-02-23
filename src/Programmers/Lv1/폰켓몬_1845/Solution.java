package Programmers.Lv1.폰켓몬_1845;

import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,0);
        }
        int key = map.keySet().size();
        int n = nums.length/2;
        return Math.min(key,n);
    }
}
