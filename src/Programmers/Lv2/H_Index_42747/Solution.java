package Programmers.Lv2.H_Index_42747;

import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int n = citations.length;
        for(int i =0; i<n; i++){
            int h = n-i;
            if(citations[i]>=h){
                return h;
            }
        }
        return 0;
    }
}
