package SWEA.D4.쇠막대기자르기_5432;
import java.util.*;
import java.io.FileInputStream;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            ArrayDeque<Character> stack = new ArrayDeque<>();

            String str = sc.next();
            int sum = 0;

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '(') {
                    stack.push('(');
                }

                //레이저 판단 / 레이저는 스택에서말고 str에서 확인
                //스택은 쇠막대기 개수 관리
                if (c == ')' && str.charAt(i-1) == '(') {
                    //레이저니까 하나 빼고 계산
                    stack.pop();
                    sum += stack.size();

                } else if (c == ')') {
                    // 쇠막대기 끝이니 제거
                    stack.pop();
                    //마지막 조각 더함
                    sum++;
                }

            }


            System.out.println("#" + test_case + " " + sum);
        }
    }
}
