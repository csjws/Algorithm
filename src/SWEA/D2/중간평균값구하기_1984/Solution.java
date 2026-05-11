package SWEA.D2.중간평균값구하기_1984;

import java.util.Scanner;
import java.util.*;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<10; i++){
                int n =sc.nextInt();
                list.add(n);
            }
            Collections.sort(list);
            list.remove(0);
            list.remove(list.size()-1);
            int sum =0;
            for(int i =0; i<list.size(); i++){
                sum += list.get(i);
            }
            System.out.println("#"+ test_case + " " + Math.round(sum / (double)list.size()));
        }
    }
}
