package Programmers.Lv1.나누어떨어지는숫자배열_12910;
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%divisor==0)
                list.add(arr[i]);
        }
        if(list.isEmpty())
            return new int[]{-1};
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for(int i =0; i<list.size();i++){
            answer[i]= list.get(i);
        }

        return answer;
    }
}
