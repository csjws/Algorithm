package Programmers.Lv1.크레인인형뽑기게임_64061;

import java.util.*;
public class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayDeque<Integer> stack = new  ArrayDeque<>();
        for (int i = 0; i < moves.length; i++) {
            for(int j = 0; j<board.length;j++){
                int item = board[j][moves[i]-1];
                if(item==0)
                    continue;
                board[j][moves[i]-1] = 0;
                if(!stack.isEmpty()&& stack.peek()==item){
                    stack.pop();
                    answer += 2;
                }
                else{
                    stack.push(item);
                }
                break;
            }
        }
        return answer;
    }
}
