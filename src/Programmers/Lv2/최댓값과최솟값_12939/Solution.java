package Programmers.Lv2.최댓값과최솟값_12939;

class Solution {
    public String solution(String s) {
        String[] answer = s.split(" ");

        int max=Integer.parseInt(answer[0]);
        int min=Integer.parseInt(answer[0]);
        for(String str : answer){
            int temp = Integer.parseInt(str);
            if(temp>max){
                max = temp;
            }
            if(temp<min){
                min = temp;
            }
        }

        return min +" "+max;
    }
}
