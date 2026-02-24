package Programmers.Lv1.문자열내p와y의개수_12916;

class Solution {
    boolean solution(String s) {
        int pcnt=0;
        int ycnt = 0;

        s = s.toLowerCase();

        for (char c : s.toCharArray()) {
            if (c == 'p') pcnt++;
            if (c == 'y') ycnt++;
        }

        return pcnt == ycnt;
    }
}
