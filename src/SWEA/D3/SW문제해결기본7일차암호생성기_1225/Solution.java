package SWEA.D3.SW문제해결기본7일차암호생성기_1225;

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

            ArrayDeque<Integer> q = new ArrayDeque<>();

            for(int i =0; i<8; i++){
                q.offer(sc.nextInt());
            }

            while(true){
                boolean end =false;
                for(int i =1; i<=5; i++){
                    int n = q.poll() - i ;
                    if(n<=0){
                        q.offer(0);
                        end = true;
                        break;
                    }

                    q.offer(n);
                }
                if(end) break;
            }

            int size = q.size();
            System.out.print("#"+test+ " ");
            for(int i  =0; i<size; i++){
                System.out.print(q.poll() + " ");
            }
            System.out.println();
        }
    }

}