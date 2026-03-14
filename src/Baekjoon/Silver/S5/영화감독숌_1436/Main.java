package Baekjoon.Silver.S5.영화감독숌_1436;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        int cnt = 0;
        int temp = 0;
        while (cnt != n){
            answer++;
            temp = answer;
            while (temp != 0){
                if (temp % 1000 == 666) {
                    cnt++;
                    break;
                }
                else temp /= 10;
            }
        }
        System.out.println(answer);
    }
}
