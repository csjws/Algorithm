import java.util.Scanner;
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
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[][]list = new int[n][n];
            for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    list[i][j]=sc.nextInt();
                }
            }
            int count=0;
            for(int i = 0; i<n; i++){
                int len=0;
                for(int j = 0; j<n; j++){
                    if(list[i][j]==1) len++;
                    else{
                        if(len==k) count++;
                        len=0;
                    }
                }
                if(len==k) count++;
            }

            for(int i = 0; i<n; i++){
                int len=0;
                for(int j = 0; j<n; j++){
                    if(list[j][i]==1) len++;
                    else{
                        if(len==k) count++;
                        len=0;
                    }
                }
                if(len==k) count++;
            }
            System.out.println("#"+test_case+" "+count);
        }
    }
}