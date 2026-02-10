package Programmers.Lv1.정수제곱근판별_12934;

public class Solution {
    public long solution(long n) {
        long sqrt = (long) Math.sqrt(n);
        if (sqrt * sqrt == n) {
            return (sqrt + 1) * (sqrt + 1);
        } else {
            return -1;
        }
    }
}
