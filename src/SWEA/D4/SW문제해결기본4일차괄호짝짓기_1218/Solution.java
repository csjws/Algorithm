package SWEA.D4.SW문제해결기본4일차괄호짝짓기_1218;
import java.util.*;
import java.io.FileInputStream;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = 10;

        for (int test_case = 1; test_case <= T; test_case++) {
            ArrayDeque<Character> stack = new ArrayDeque<>();
            int n = sc.nextInt();
            String str = sc.next();
            boolean valid = true;

            for (int i = 0; i < n; i++) {
                char c = str.charAt(i);

                if (c == '(') {
                    stack.push('(');
                } else if (c == '{') {
                    stack.push('{');
                } else if (c == '[') {
                    stack.push('[');
                } else if (c == '<') {
                    stack.push('<');
                }

                else {
                    //시작부터 닫는 괄호면 break
                    if (stack.isEmpty()) {
                        valid = false;
                        break;
                    }

                    if (c == ')' && stack.peek() == '(') {
                        stack.pop();
                    } else if (c == '}' && stack.peek() == '{') {
                        stack.pop();
                    } else if (c == ']' && stack.peek() == '[') {
                        stack.pop();
                    } else if (c == '>' && stack.peek() == '<') {
                        stack.pop();
                    } else {
                        valid = false;
                        break;
                    }
                }
            }

            if (valid && stack.isEmpty())
                System.out.println("#" + test_case + " 1");
            else
                System.out.println("#" + test_case + " 0");
        }
    }
}
