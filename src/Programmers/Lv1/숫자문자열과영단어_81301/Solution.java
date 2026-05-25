package Programmers.Lv1.숫자문자열과영단어_81301;

import java.util.*;
class Solution {
    public int solution(String s) {
        String[] strNum = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < strNum.length; i++) {
            s = s.replace(strNum[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }
}
