package Programmers.Lv1.음양더하기_76501;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i =0; i<signs.length; i++){
            if(signs[i]==false)
                absolutes[i] += absolutes[i]*(-2);
            answer += absolutes[i];
        }
        return answer;
    }
}
