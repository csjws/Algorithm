package Programmers.Lv1.하샤드수_12947;

public class Solution {
    public boolean solution(int x) {
        String a = Integer.toString(x);
        int sum = 0;
        for(int i = 0; i<a.length(); i++){
            sum += a.charAt(i) - '0';
        }
        if(x%sum == 0)
            return true;
        else return false;
    }
}
