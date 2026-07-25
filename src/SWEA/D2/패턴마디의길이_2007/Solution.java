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
            int cnt = 0;

            for (int i = 1; i <= 10; i++) {
                if (i * 2 <= str.length()) {
                    String p = str.substring(0, i);

                    if (p.equals(str.substring(i, i * 2))) {
                        cnt = i;
                        break;
                    }
                }
            }
            System.out.println("#" + test_case + " " + cnt);
        }
    }
}