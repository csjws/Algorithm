package SWEA.D2.간단한소인수분해_1945;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = sc.nextInt();
            int[] list = {2,3,5,7,11};
            int[] result = new int[list.length];
            for(int i =0; i<list.length; i++){
                while(true){
                    if(n%list[i] ==0){
                        n /= list[i];
                        result[i]++;
                    }
                    else break;
                }
            }

            System.out.print("#"+test_case);
            for(int i = 0; i < result.length; i++) {

                System.out.print(" "+ result[i]);
            }
            System.out.println();
        }
    }
}
