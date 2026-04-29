package Programmers.Lv2.타겟넘버_43165;

class Solution {
    int cnt = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers,target,0,0);
        return cnt;
    }
    void dfs(int[] numbers, int target, int index, int sum){
        if(index == numbers.length){
            if(target == sum){
                cnt++;
            }
            return;
        }
        dfs(numbers,target,index+1,sum + numbers[index]);
        dfs(numbers,target,index+1,sum - numbers[index]);
    }
}
