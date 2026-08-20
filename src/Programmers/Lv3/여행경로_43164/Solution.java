package Programmers.Lv3.여행경로_43164;

import java.util.*;
class Solution {
    static boolean[] visited;
    static List<String> list;

    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        list = new ArrayList<>();

        //1열 정렬 후 같은 값이 있으면 2열 정렬
        Arrays.sort(tickets, (a, b) -> {
            int result = a[0].compareTo(b[0]);

            if (result == 0) {
                return a[1].compareTo(b[1]);
            }

            return result;
        });

        list.add("ICN");
        dfs(tickets,"ICN");

        return list.toArray(new String[0]);
    }

    static boolean dfs(String[][] tickets, String cur){
        //티켓을 다 사용 했을때
        if(list.size() == tickets.length +1) return true;

        for(int i =0; i<tickets.length; i++){
            //방문한지
            if(visited[i]) continue;

            //현재위치와 출발 위치가 같지않은지
            if(!tickets[i][0].equals(cur)) continue;

            visited[i] = true;
            list.add(tickets[i][1]);

            if(dfs(tickets,tickets[i][1])) return true;

            //원복
            visited[i] = false;
            list.remove(list.size() - 1);

        }
        return false;
    }
}