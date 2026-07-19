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
            int cnt = 0;
            int answer = 0;
            int  k = 1;
            boolean[] visited = new boolean[10];
            while(cnt <10){
                int num = k * n;
                answer =num;
                int temp = num;
                while(temp >0){
                    int d = temp % 10;
                    if(!visited[d]){
                        visited[d] = true;
                        cnt++;
                    }
                    temp /= 10;
                }
                k++;
            }
            System.out.println("#"+test_case+" " + answer);
        }

    }
}