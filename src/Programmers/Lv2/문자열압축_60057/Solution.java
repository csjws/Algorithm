package Programmers.Lv2.문자열압축_60057;

import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = s.length();
        if(s.length()==1)
            return 1;
        for(int i = 1; i<=s.length(); i++){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            String str = s.substring(0,i);
            for(int j =i; j<=s.length(); j+=i){
                int end = Math.min(i+j,s.length());
                String next = s.substring(j,end);
                if(str.equals(next)){
                    count++;
                }
                else{
                    if(count>1){
                        sb.append(count);
                    }
                    sb.append(str);
                    str = next;
                    count = 1;
                }
            }
            if(count>1){
                sb.append(count);
            }
            sb.append(str);
            answer = Math.min(answer,sb.length());
        }
        return answer;
    }
}
