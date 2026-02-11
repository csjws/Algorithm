package Programmers.Lv1.가운데글자가져오기_12903;

class Solution {
    public String solution(String s) {
        String answer = "";

        if (s.length() % 2 == 1) {
            return String.valueOf(s.charAt(s.length() / 2));
        }
        else {
            for (int i = s.length() / 2 -1; i <= s.length() / 2; i++) {
                answer += s.charAt(i);
            }
        }

        return answer;
    }
}