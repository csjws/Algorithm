package Programmers.Lv2.예상대진표_12985;

class Solution
{
    public int solution(int n, int a, int b)
    {
        int round = 0;
        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            round++;
        }
        return round;
    }
}
