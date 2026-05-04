package SWEA.D2.스도쿠검증_1974;

import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int[][] list = new int [9][9];
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    list[j][k] = sc.nextInt();
                }
            }
            boolean ok = true;
            for(int j=0;j<9;j++){
                int[]check = new int[10];
                for(int k=0;k<9;k++){
                    check[list[j][k]]++;
                    if(check[list[j][k]]>1){
                        ok = false;
                    }
                }
            }
            for(int j=0;j<9;j++){
                int[]check = new int[10];
                for(int k=0;k<9;k++){
                    check[list[k][j]]++;
                    if(check[list[k][j]]>1){
                        ok = false;
                    }
                }
            }
            for (int j = 0; j < 9; j += 3) {
                for (int k = 0; k < 9; k += 3) {
                    int[]check = new int[10];
                    for(int z=0;z<3;z++){
                        for(int y=0;y<3;y++){
                            check[list[j+z][k+y]]++;
                            if(check[list[j+z][k+y]]>1){
                                ok = false;
                            }
                        }
                    }
                }
            }
            System.out.println("#" + i + " " + (ok ? 1 : 0));
        }
    }
}
