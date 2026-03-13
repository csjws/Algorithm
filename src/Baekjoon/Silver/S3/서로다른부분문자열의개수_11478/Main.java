package Baekjoon.Silver.S3.서로다른부분문자열의개수_11478;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet set = new HashSet();
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                sb.append(s.charAt(j));
                set.add(sb.toString());
            }
        }
        System.out.println(set.size());
    }
}
