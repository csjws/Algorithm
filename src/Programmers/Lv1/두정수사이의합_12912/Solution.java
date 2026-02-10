package Programmers.Lv1.두정수사이의합_12912;

public class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        while (true) {
            if (a < b) {
                answer += a;
                a++;
            } else if (a > b) {
                answer += a;
                a--;
            } else {
                answer += a;
                break;
            }
        }
        return answer;
    }
}
