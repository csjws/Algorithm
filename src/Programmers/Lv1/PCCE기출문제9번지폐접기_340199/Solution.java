package Programmers.Lv1.PCCE기출문제9번지폐접기_340199;

import java.util.*;
class Solution {
    public int solution(int[] wallet, int[] bill) {
        int walletW = wallet[0];
        int walletH = wallet[1];
        int billW = bill[0];
        int billH = bill[1];
        int answer = 0;
        while(true){
            if((billW<=walletW && billH<=walletH) || (billW<=walletH && billH <= walletW)){
                return answer;
            }
            if(billW > billH){
                billW /=2;
            }else{
                billH /=2;
            }
            answer++;
        }
    }
}
