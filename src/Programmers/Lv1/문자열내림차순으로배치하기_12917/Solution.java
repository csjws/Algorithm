package Programmers.Lv1.문자열내림차순으로배치하기_12917;

import java.util.*;
class Solution {
    public String solution(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        StringBuilder sb = new StringBuilder();
        for(int i=c.length-1; i>=0; i--){
            sb.append(c[i]);
        }
        return sb.toString();
    }
}
