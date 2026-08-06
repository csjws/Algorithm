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
            int cnt =0;

            char cur = '0';
            for(int i = 0; i<str.length(); i++){
                if(str.charAt(i) != cur){
                    cnt++;
                    cur = str.charAt(i);
                }

            }
            System.out.println("#"+test_case+" "+cnt);
        }
    }
}