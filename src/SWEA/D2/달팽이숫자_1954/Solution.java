package SWEA.D2.달팽이숫자_1954;

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
            int n =sc.nextInt();
            int[][]list = new int[n][n];
            int num = 1;
            int top = 0,  bottom = n-1, left = 0, right = n-1;

            while(num<=n*n){
                for(int i = left; i<=right; i++){
                    list[top][i]=num++;
                }
                top++;
                for(int i =top; i<=bottom; i++){
                    list[i][right]=num++;
                }
                right--;
                for(int i = right; i>=left; i--){
                    list[bottom][i]=num++;
                }
                bottom--;
                for(int i = bottom; i>=top; i--){
                    list[i][left]=num++;
                }
                left++;
            }
            System.out.println("#"+ test_case);
            for(int i =0; i<n; i++){
                for(int j =0; j<n; j++){
                    System.out.print(list[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
