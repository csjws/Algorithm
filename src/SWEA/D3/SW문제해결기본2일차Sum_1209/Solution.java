package SWEA.D3.SW문제해결기본2일차Sum_1209;

import java.util.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=10;


        for(int test_case = 1; test_case <= T; test_case++)
        {
            int test = sc.nextInt();
            int[][] list = new int[100][100];

            for(int i =0; i<100; i++){
                for(int j = 0; j<100; j++){
                    list[i][j]=sc.nextInt();
                }
            }

            int result = 0;
            int sum =0;

            //행
            for(int i =0; i<100; i++){
                sum =0;
                for(int j = 0; j<100; j++){
                    sum += list[i][j];
                }
                result = Math.max(result,sum);
            }

            //열
            for(int i =0; i<100; i++){
                sum =0;
                for(int j = 0; j<100; j++){
                    sum += list[j][i];
                }
                result = Math.max(result,sum);
            }

            sum =0;

            //좌에서우 대각선
            for(int i =0; i<100; i++){
                sum += list[i][i];
            }
            result = Math.max(result,sum);

            sum =0;

            //우에서좌 대각선
            for(int i = 0; i < 100; i++){
                sum += list[i][99 - i];
            }
            result = Math.max(result,sum);

            System.out.println("#"+test+" "+result);
        }
    }

}
