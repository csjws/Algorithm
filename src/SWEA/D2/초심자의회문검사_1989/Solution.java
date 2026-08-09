package SWEA.D2.초심자의회문검사_1989;
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
            String str = sc.next();
            String reverse = new StringBuilder(str).reverse().toString();

            if (str.equals(reverse))
                System.out.println("#" + test_case + " 1");
            else
                System.out.println("#" + test_case + " 0");
        }
    }
}