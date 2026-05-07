package SWEA.D2.Base64Decoder_1928;

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
        for(int test_case = 1; test_case <= T; test_case++)
        {
            String s = sc.next();
            byte[] str = Base64.getDecoder().decode(s);
            String decodestr = new String(str);
            System.out.println("#"+test_case+" "+decodestr);
        }
    }
}
