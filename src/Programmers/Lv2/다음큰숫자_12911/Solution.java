package Programmers.Lv2.다음큰숫자_12911;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int nowCount = Integer.bitCount(n);

        while(true){
            n++;
            int nextCount = Integer.bitCount(n);

            if(nowCount == nextCount){
                break;
            }
        }

        answer = n;

        return answer;
    }
}