package Baekjoon.Silver.S4.듣보잡_1764;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0; i < n; i++){
            String str = sc.next();
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(int i = 0; i < m; i++){
            String str = sc.next();
            map.put(str,map.getOrDefault(str,0)+1);
        }

        ArrayList<String> list = new ArrayList<>();
        for(String result : map.keySet()){
            if(map.get(result)==2){
                list.add(result);
            }
        }

        Collections.sort(list);

        System.out.println(list.size());
        for(String s : list){
            System.out.println(s);
        }
    }
}
