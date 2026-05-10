package SWEA.D2.간단한369게임_1926;

import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i =1; i<=T; i++){
            String s = String.valueOf(i);
            int count =0;
            for(int j=0; j<s.length();j++){
                char c = s.charAt(j);
                if(c=='3'||c=='6'||c=='9')
                    count++;
            }
            if(count==0) sb.append(s);
            else{
                for(int j=0; j<count; j++)
                    sb.append("-");
            }
            if(i<T) sb.append(' ');
        }
        System.out.println(sb.toString());
    }
}
